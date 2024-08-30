package String;

import java.util.Scanner;

public class StringMethodSubstringLengthOfK 
{
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter the start index:");
        int s = sc.nextInt();
        System.out.println("Enter the end index:");
        int e = sc.nextInt();

        String subStrWithStartIndex = str.substring(s);
        String subStrWithStartAndEndIndex = str.substring(s, e);

        System.out.println("Substring with start index: " + subStrWithStartIndex);
        System.out.println("Length of this substring: " + subStrWithStartIndex.length());
        
        System.out.println("Substring with start and end index: " + subStrWithStartAndEndIndex);
        System.out.println("Length of this substring: " + subStrWithStartAndEndIndex.length());

    
    }
}

