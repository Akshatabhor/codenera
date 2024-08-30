package RevisionPractice;

import java.util.Scanner;

public class MatrixRotationClockwise {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row and column size");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int a[][]=new int[row][col];
		
		System.out.println("enter the matrix element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("clockwise matrix rotation");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");
			}
			System.out.println();
		}
	}

}
