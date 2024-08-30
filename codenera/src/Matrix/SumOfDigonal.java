package Matrix;
import java.util.Scanner;
public class SumOfDigonal {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the row size:");
		int row=sc.nextInt();
		System.out.println("enter the col size:");
		int col=sc.nextInt();

		int a[][]=new int [row][col];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("enter element of matrix:");
				a[i][j]=sc.nextInt();

			}
			System.out.println();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j)
				{
					System.out.print(a[j][i]+" ");
				 	sum =sum+a[i][j];
				}
			}
			System.out.println();
		}
			System.out.println("Sum of primary digonal: "+sum);

	}

}
