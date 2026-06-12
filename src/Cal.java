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
    public double Power(double a, double b){
        return Math.pow(a,b);
    }
    public double squareroot(double a){
        if(a<0){
            throw new ArithmeticException("Negative number can't have square root");
        }
        double result = Math.sqrt(a);
        return result;
    }
    public double Modulus(double a,double b){
        if(b==0){
            throw new ArithmeticException("Divide by Zero Error");
        }
        return a%b;
    }
}
