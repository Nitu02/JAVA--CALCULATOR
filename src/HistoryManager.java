package src;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class HistoryManager{
    
        private ArrayList<String> history = new ArrayList<>();
        public void add(String record){
            history.add(LocalDateTime.now() +" -> "+record);
        }
        public void clearFile(){
            try{
                FileWriter writer = new FileWriter("history.txt");
                writer.write(" ");
                writer.close();
                System.out.println("File History Cleared.!!!!!!!!!");
            }
            catch(IOException e){
                System.out.println("Error in clearing File History!!!!!!!!! File History Intact!!!!!!!!!");

            }
            
        }
        public void clearHistory(){
            history.clear();
            System.out.println("Current History Cleared.");
        }
        public void saveHistory(){
            try{
                FileWriter writer = new FileWriter("history.txt");
                for(String record : history){
                    writer.write(record+"\n");
                }
                writer.close();
                System.out.println("History Saved Successfully!!!!!!!!!!!!!!!!!");
            }
            catch(IOException e){
                System.out.println("Error saving history.");
            }
        }
        public void showhistory(){
            if(history.isEmpty()){
                System.out.println("No Calculation perfomred!!!!!!!!!!!!");
                return;
            }
            System.out.println(" ======================== Calculator History =============================");
            for(String record: history){
                System.out.println(record);
            }

        }
    
}