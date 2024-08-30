package Matrix;

import java.util.Scanner;

public class Matrix1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row and colume size");
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
		int sum=0;
		int secsum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+ " ");
				if(i==j)
				{
					sum=sum+a[i][j];
				}
				if(i+j==2)
				{
					secsum=secsum+a[i][j];
				}
			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int rowsum=0;
			for(int j=0;j<a[i].length;j++)
			{
				rowsum=rowsum+a[i][j];
			}
			System.out.println("sum of row:"+rowsum);
			
		}
		for(int i=0;i<a.length;i++)
		{
			int colsum=0;
			for(int j=0;j<a[i].length;j++)
			{
				colsum=colsum+a[j][i];
			}
			System.out.println("sum of colume:"+colsum);
			
		}
		
		System.out.println("sum of primary diagonal"+sum);
		System.out.println("sum of secondary diagonal"+secsum);

	}

}
