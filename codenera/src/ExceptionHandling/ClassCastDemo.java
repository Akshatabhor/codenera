package ExceptionHandling;

public class ClassCastDemo {

    public static void performTypeCasting(Object obj) {
        try {
            String str = (String) obj;
            System.out.println("Typecasting successful: " + str);
        } catch (ClassCastException e) {
            System.out.println("Error: Typecasting failed. " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Object number = 100;

        performTypeCasting(number);

        System.out.println("Program execution continues...");
    }
}
