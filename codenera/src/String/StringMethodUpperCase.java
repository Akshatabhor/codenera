package String;

import java.util.Scanner;

public class StringMethodUpperCase {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.next();
		
		s1 = s1.toUpperCase(); //  uppercase
		
		System.out.println("Upper case : "+s1);
		
		
		s1 = s1.toLowerCase(); // Lowercase
		
		System.out.println("Lowercase str : "+s1);
		
	}

}
