package Matrix;
import java.util.Scanner;
public class FrequencyMatrix {

	public static void main(String[] args) 
	{ 
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Row size");
				int row=sc.nextInt();
				System.out.println("Enter Column size");
				int col=sc.nextInt();
				
				int a[][]=new int[row][col];
				
				System.out.println("Enter Elements of Matrix");
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						a[i][j]=sc.nextInt();
					}
				}
				System.out.println("Given Matrix");
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
					{
						System.out.print(a[i][j]+" ");
					}
				System.out.println();

				}
				System.out.println("Frequency of each Elements");
				int ele=sc.nextInt();
				int cnt=0;
				for(int i=0;i<a.length;i++)
				{
					for(int j=0;j<a[i].length;j++)
						{
							if(a[i][j]==ele)
							{
								cnt++;
								
							}
						}
					}
				   System.out.println("The frequency of the element "+ele+" is: "+cnt);

				}

			
	}


