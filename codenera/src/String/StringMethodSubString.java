package String;

import java.util.Scanner;

public class StringMethodSubString {

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		System.out.println("enter the start index:");
		int s=sc.nextInt();
		System.out.println("enter the end index:");
		int e=sc.nextInt();
		
		System.out.println("substring with start index:"+str.substring(s));
		System.out.println("substring with start  and end index:"+str.substring(s,e));

	}

}
