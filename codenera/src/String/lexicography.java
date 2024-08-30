package String;

import java.util.Scanner;

public class lexicography {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string 1");
		String s1=sc.nextLine();
		System.out.println("enter the string 2");
		String s2=sc.nextLine();
		
		int comparisionresult=s1.compareToIgnoreCase(s2);
		
		System.out.println("String 1:"+s1);
		System.out.println("String 2:"+s2);
		
		if(comparisionresult==0)
		{
			System.out.println("s1 is equal to s2");
		}
		else if(comparisionresult<=0)
		{
			System.out.println("s1 is lexicographically less than s2");

		}
		else 
		{
			System.out.println("s1 is lexicographically greater than s2");

		}

		
	}

}
