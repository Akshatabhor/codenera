package Matrix;
import java.util.Scanner;
public class ClockwiseMatrix {

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
		System.out.println("clocwise matrix rotation:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[j][i]+" ");
			}
		System.out.println();
		}

	}

}
