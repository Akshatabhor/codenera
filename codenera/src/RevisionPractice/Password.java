package RevisionPractice;
public class Password {

    public static boolean isValidPassword(String password) 
    {
        if (password.length() < 10) {
            System.out.println("A password must have at least ten characters.");
            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) 
        {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch))
            {
                System.out.println("A password consists of only letters and digits.");
                return false;
            }
            if (Character.isDigit(ch)) 
            {
                digitCount++;
            }
        }

        if (digitCount < 2) 
        {
            System.out.println("A password must contain at least two digits.");
            return false;
        }

        return true;
    }

    public static void main(String[] args)
    {
        String password = "abcd1234"; 

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid: " + password);
        }
    }
}
