package String;
import java.util.Scanner;
public class RotateWord 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        String s[] = str.split(" ");

        StringBuilder reversedString = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) 
        {
            reversedString.append(s[i]);
            if (i != 0) 
            {
                reversedString.append(" ");
            }
        }

        System.out.println("Rotated string: " + reversedString.toString());

      
    }

	}


