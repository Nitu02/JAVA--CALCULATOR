package src;
import java.util.Scanner;

public class InputValidator {
    public static double getValidInput(Scanner sc){
        while(true){
            try{
                return Double.parseDouble(sc.next());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input! Enter a number:");
            }
        }
    }
    public static int getValidNumber(Scanner sc) {
        while(true){
            try{
                int choice=Integer.parseInt(sc.next());
                if(choice >=1 && choice <=5){
                    return choice;
                }
                System.out.print("Enter a choice between 1 and 5: ");

            }
            catch(NumberFormatException e){
                System.out.print("Invalid choice ! Enter a number: ");
            }
        }
        
    }
    
}
