package Matrix;
import java.util.Scanner;
public class SumOfRowCol {

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
				System.out.print("enter :"+i+""+j+"th index element of matrix:");
				a[i][j]=sc.nextInt();

			}
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int colsum = 0;
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(j+""+i+" :"+a[j][i]+" ");
				 colsum = colsum+a[j][i];
			}
			System.out.println("Sum of col:"+colsum);
			System.out.println();
		}
		for(int i=0;i<a.length;i++)
		{
			int rowsum = 0;
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(i+""+j+" :"+a[i][j]+" ");
				 rowsum = rowsum+a[i][j];

			}
			System.out.println("Sum of row:" + rowsum);
			System.out.println();
		}


	}

}
