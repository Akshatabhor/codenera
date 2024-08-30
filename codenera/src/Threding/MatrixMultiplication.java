package Threding;

public class MatrixMultiplication extends Thread
{
		public void run()
		{
			int a[][]={{1,2,3},{1,2,3}};
			int b[][]={{1,2},{1,2},{1,2}};
			int c[][]=new int[a.length][b[0].length];

			System.out.println("Matrix 1 :");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("Matrix 2 :");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}

			System.out.println("Matrix Multiplication :");
			if(a.length == b[0].length)
			{
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<b[i].length;j++)
					{
						for(int k=0;k<a[i].length;k++)
						{
							c[i][j]=c[i][j]+a[i][k]*b[k][j];
						}
					}
				}
				for(int i=0;i<c.length;i++)
				{
					for(int j=0;j<c[i].length;j++)
					{
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
				}	
			}
	        else
	        {
				System.out.println("Matrix Multiplication is not possible because row of first matrix is not equal to column of second matrix.");
			}
		}

		public static void main(String[] args) throws InterruptedException
		{
			MatrixMultiplication obj=new MatrixMultiplication();
			obj.start();
			obj.join();
			MatrixMultiplication obj1=new MatrixMultiplication();
			obj1.start();
			obj1.join();
		}

	}



