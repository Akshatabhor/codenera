/*Write a Java program that accepts a string as input and 
 * attempts to parse it into an integer using the 
 * Integer.parseInt() method. Handle the NumberFormatException
 *  that may occur if the string cannot be parsed into an 
 *  integer and display a
custom error message indicating the invalid input.*/

package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandlingQ1 {

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the string:");
			String s2=sc.next();
			int a1=Integer.parseInt(s2);
		}
		catch(Exception e)
		{
			System.out.println("exception occuer:"+e);
		}
		finally 
		{
			System.out.println("final block execute");
		}
	}

}
