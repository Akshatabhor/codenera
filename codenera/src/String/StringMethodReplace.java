package String;

import java.util.Scanner;

public class StringMethodReplace {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		
		String str2= str.replace("java", "python");
		
		System.out.println("after replacement String:"+str2);
		
		
	}

}
