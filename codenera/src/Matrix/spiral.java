package Matrix;

import java.util.Scanner;

public class spiral {

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
		System.out.println("given matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("spiral matrix");
		int left=0,right=a.length-1;
		int top=0,bottom=a.length-1;
		while(left<=right && top<=bottom)
		{
			for(int i=left;i<=right;i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(a[i][right]+" ");
			
			}
			right--;
			if(top<=bottom)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(a[bottom][i]+" ");
				}
				bottom--;
			}
			if(left<=right)
			{
				for(int i=bottom;i>=top;i--)
				{
					System.out.print(a[i][left]+" ");
				}
				left++;
			}
		}
		System.out.println();

	}

}
