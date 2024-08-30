package oops;

import java.util.Scanner;

public class armstrongnoreturnwithargument 
{
	public void findarmstrong(int no)
	{
		
		System.out.println("amstrong number between 1 to "+no+" :");

		for(int i=1;i<no;i++)
		{
			int sum=0;int rem=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				sum=sum+(rem*rem*rem);
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		}
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int no=sc.nextInt();
		armstrongnoreturnwithargument obj = new armstrongnoreturnwithargument();
		obj.findarmstrong(no);
	}

}
