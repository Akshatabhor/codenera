package Matrix;
import java.util.Scanner;
public class SortedMatrix {

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

		int min=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					if(a[i][j]>a[i][k])
					{
						int temp=a[i][j];
						a[i][j]=a[i][k];
						a[i][k]=temp;
					}
				}
			}
		}
		System.out.println("sorted matrix element:");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
