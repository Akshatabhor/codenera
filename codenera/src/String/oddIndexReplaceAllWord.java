package String;

import java.util.Scanner;

public class oddIndexReplaceAllWord {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String str = sc.nextLine();

	        String[] s= str.split("\\s+");

	        for (int i = 0; i < s.length; i++) {
	            if (i % 2 == 1) 
	            {
	                s[i] = "welcome";
	            }
	        }

	        String replacedSentence = String.join(" ", s);

	        System.out.println("Modified sentence:");
	        System.out.println(replacedSentence);
	}

}
