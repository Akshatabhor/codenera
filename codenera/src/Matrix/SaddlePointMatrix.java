package Matrix;

public class SaddlePointMatrix {

	public static void main(String[] args)
	{
				int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
				for(int i = 0;i < a.length;i++)
				{
					for(int j = 0;j < a[i].length;j++)
					{
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				int ind = -1;
				for(int i = 0;i < a.length;i++)
				{
					int minR = Integer.MAX_VALUE;
					int maxC = Integer.MIN_VALUE;
					for(int j = 0;j < a[i].length;j++)
					{
						if(a[i][j] < minR)
						{
							minR = a[i][j];
							ind = j;
						}
					}
					for(int  k = 0;k < a[i].length;k++)
					{
						if(a[k][ind] > maxC)
						{
							maxC = a[k][ind];
						}
					}
					if(minR == maxC)
					{
						System.out.print("Saddle Point :" + minR);
					}
				}

			}

		
	}


