package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringMethodSplit {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s1 = sc.nextLine(); 
		String s[]=s1.split("a");
		System.out.println(Arrays.toString(s));
		
	}

}
