package src;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cal cs = new Cal();
        HistoryManager hs = new HistoryManager();
        System.out.println("          CALCULATOR                   ");
        while(true){
            System.out.println(" 1. Addition ");
            System.out.println(" 2. Subtraction ");
            System.out.println(" 3. Multiplication  ");
            System.out.println(" 4. Division ");
            System.out.println(" 5. Modulus");
            System.out.println(" 6. Square Root");
            System.out.println(" 7. Power of Number");
            System.out.println(" 8. History");
            System.out.println(" 9. Exit");

            System.out.println("\n MAKE YOUR CHOICE \n");
            int choice = InputValidator.getValidNumber(sc);
            if(choice == 9 ){
                System.out.println("Exiting!!!!!!!!!!!!!!!!!!!!!!!!!");
                break;
            }
            double a =0;
            double b=0;
            if(choice!=6 && choice !=8){
                System.out.println("Enter 1st value:");
            
                a = sc.nextDouble();
                System.out.println("Enter 2nd value:");
                b = sc.nextDouble();
            }
            else if(choice ==6){
                System.out.println("Enter value:");
                a = sc.nextDouble();

            }
            

            try{
                switch(choice){
                    case 1:{
                        double result = cs.Addition(a,b);
                        hs.add(a+" + "+ b+" = "+result);
                        System.out.println(result);
                        break;
                    }
                    case 2:{
                        double result = cs.Substraction(a,b);
                        hs.add(a+" - "+ b +" = "+result);
                        System.out.println(result);
                        break;
                    }
                    case 3:{
                        double result= cs.Multiplication(a,b);
                        hs.add(a+" * "+ b +" = "+ result);
                        System.out.println(result);
                        break;
                    }
                    case 4:{
                        double result= cs.Division(a,b);
                        hs.add(a+" / "+ b +" = "+ result);
                        System.out.println(result);
                        break;
                    }
                    case 5:{
                        double result= cs.Modulus(a,b);
                        hs.add(a+" % "+ b +" = "+ result);
                        System.out.println(result);
                        break;
                    }
                    case 6:{
                        double result= cs.squareroot(a);
                        hs.add(" √ "+ a +" = "+ result);
                        System.out.println(result);
                        break;
                    }
                    case 7:{
                        double result= cs.Power(a,b);
                        hs.add(a+" ^ "+ b +" = "+ result);
                        System.out.println(result);
                        break;
                    }
                    case 8:{
                        System.out.println("History: ========>");
                        hs.showhistory();
                        break;
                    }
                        
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
