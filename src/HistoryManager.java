package src;
import java.util.ArrayList;

public class HistoryManager{
    
        private ArrayList<String> history = new ArrayList<>();
        public void add(String record){
            history.add(record);
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