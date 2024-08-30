package Matrix;

import java.util.Scanner;

public class MultiplicationOfTwomatrix {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row size:");
		int row=sc.nextInt();
		System.out.println("enter the col size:");
		int col=sc.nextInt();

		int a[][]=new int [row][col];
		int b[][]=new int [row][col];
		int c[][]=new int [row][col];

		System.out.println("enter the first matrix element:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();

			}
			System.out.println();
		}
		System.out.println("enter the second matrix element:");

		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();

			}
			System.out.println();
		}

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]*b[i][j];

			}
			System.out.println();
		}
		System.out.println("multiplication of two matrix:");

		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");

			}
			System.out.println();
		}
	}

}
