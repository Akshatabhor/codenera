package String;

import java.util.Scanner;

public class StringMethodEqual {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter String 1: ");
		//String str = sc.next();   
		//System.out.println("Enter String 2: ");
		//String str1=sc.next();
		//if(str.equals(str1)) //equal method
		
		String str="akshata";
		String str1="gaurav";
		
		if(str==str1)//equaloperator
		{
			System.out.println("str is equal to str1");
		}
		else
		{
			System.out.println("str is not equal to str1");
		}
	}

}
