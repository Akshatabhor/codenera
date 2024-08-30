package String;

import java.util.Scanner;

public class NPartsDivide {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.next();
		System.out.println("how many parts divide the string:");
		int n=sc.nextInt();
		
		int strlength=str.length();
		
		if(strlength%n!=0)
		{
			System.out.println("not possible");
		}
		else
		{
			int dividelength=strlength/n;
			for(int i=0;i<strlength;i=i+dividelength)
			{
				System.out.println(str.substring(i,i+dividelength));
			}
		}
	}

}
