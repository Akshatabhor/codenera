package Recursion;

import java.util.Scanner;

public class Recusrion2 
{
	static int fact=1;
	
	public static int disp(int i)
	{
		if(i>1)
		{
			fact=fact*i;
			disp(i-1);
		}
		return fact;
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Recusrion2 ob=new Recusrion2();
		System.out.println("Enter a No:");
		int n=sc.nextInt();
		System.out.println("factorial :" +disp(n));
	}

}
