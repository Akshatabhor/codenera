package ExceptionHandling;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionChainingDemo {

    public static void checkAge(int age) throws InvalidAgeException {
        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            } else if (age < 18) {
                throw new ArithmeticException("Age is below the legal minimum.");
            }
        } catch (IllegalArgumentException | ArithmeticException e) {
            throw new InvalidAgeException("Invalid age provided.", e);
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
            System.out.println("Root Cause: " + e.getCause());
        }

        System.out.println("Program execution continues...");
    }
}
