package Pattern;

import java.util.Scanner;

public class CharPattern23 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int c=1,as=65;
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(as+c-1)+" ");
				c=c*(i-j)/j;
			}
			System.out.println();
		}

	}

}
