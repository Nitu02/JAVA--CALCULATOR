package src;

public class Cal {
    public double Addition(double a, double b){
        return a+b;
    }
    public double Substraction(double a, double b){
        return a-b;
    }
    public double Multiplication(double a, double b){
        return a*b;
    }
    public double Division(double a, double b){
        if(b==0){
            throw new ArithmeticException("Division by zero Error!!!!");
        }
        double result = (double)a/b;
        return result;
    }
}
