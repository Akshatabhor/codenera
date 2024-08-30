package ExceptionHandling;
public class ThrowsKeywordDemo {

    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return (double) numerator / denominator;
    }

    // Method that calls the divide method and handles the exception
    public static void performDivision(int numerator, int denominator) {
        try {
            double result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        // Calling the method that handles the exception
        performDivision(numerator, denominator);

        System.out.println("Program execution continues...");
    }
}
