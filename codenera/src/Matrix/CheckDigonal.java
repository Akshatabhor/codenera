package Matrix;
import java.util.Scanner;
public class CheckDigonal 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of row and col:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int a[][]=new int [row][col];
		
		System.out.println("enter the matrix element:");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();

			}
		}
		System.out.println("given matrix:");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i!=j && a[i][j]!=0)
				{
					c++;
					break;
				}
				else if(i==j && a[i][j]==0)
				{
					c++;
					break;
				}
			
			}
			if(c==1)
			{
				break;
			}
		}
		if(c==0)
		{
			System.out.println("given matrix is diagonal");
		}
		else
		{
			System.out.println("given matrix is not diagonal");
		}

	}

}
