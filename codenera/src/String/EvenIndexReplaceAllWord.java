package String;
import java.util.Scanner;
public class EvenIndexReplaceAllWord {
	
	public static void main(String[] args) 
	{
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String str = sc.nextLine();

		        String[] s= str.split("\\s+");

		        // Replace words at even indices with "INDIA"
		        for (int i = 0; i < s.length; i++) {
		            if (i % 2 == 0) 
		            {
		                s[i] = "INDIA";
		            }
		        }

		        String replacedSentence = String.join(" ", s);

		        System.out.println("Modified sentence:");
		        System.out.println(replacedSentence);

		    }
		

	}


