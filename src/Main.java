package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cal cs = new Cal();
        System.out.println("          CALCULATOR                   ");
        while(true){
            System.out.println(" 1. Addition ");
            System.out.println(" 2. Subtraction ");
            System.out.println(" 3. Multiplication  ");
            System.out.println(" 4. Division ");
            System.out.println(" 5. Exit");

            System.out.println("\n MAKE YOUR CHOICE \n");
            int choice = InputValidator.getValidNumber(sc);
            if(choice == 5 ){
                System.out.println("Exiting!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }

            System.out.println("Enter the values");
            
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            try{
                switch(choice){
                    case 1:
                        System.out.println(cs.Addition(a, b));
                        break;
                    case 2:
                        System.out.println(cs.Substraction(a, b));
                        break;
                    case 3:
                        System.out.println(cs.Multiplication(a, b));
                        break;
                    case 4:
                        System.out.println(cs.Division(a, b));
                        break;
                    default:
                        System.out.println("Invalid Choice!!");
                        break;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        sc.close();

    }
    
}
