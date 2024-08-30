package ExceptionHandling;

class DivisionByZeroException extends Exception
{
 public DivisionByZeroException(String message)
 {
     super(message);
 }
}

public class DivisionDemo 
{

 public static double divide(int numerator, int denominator) throws DivisionByZeroException {
     if (denominator == 0) 
     {
         throw new DivisionByZeroException("Error: Division by zero is not allowed.");
     }
     return (double) numerator / denominator;
 }

 public static void main(String[] args) 
 {
     int numerator = 10;
     int denominator = 0;

     try 
     {
         double result = divide(numerator, denominator);
         System.out.println("Result: " + result);
     } 
     catch (DivisionByZeroException e)
     {
         System.out.println(e.getMessage());
     }
 }
}
