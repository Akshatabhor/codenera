package ExceptionHandling;
import java.util.Scanner;
public class NestedTryBlock {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no:");
		//try
		//{
			//int a[]= {1,2,3,4,5,6};
			//for(int i=0;i<=a.length;i++)
			//{
				//System.out.println(a[i]+" ");
		//	}
			try
			{
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				double ans=n1/n2;
				System.out.println(ans);
			}
		
			catch(Exception e)
			{
				System.out.println("exception occure:"+e);
			}
			int b[]= {1,2,3,4,5};
			try
			{
				for(int i=0;i<=b.length;i++)
				{
					System.out.println(b[i]+" ");
				}
			}
			catch(Exception e1)
			{
				System.out.println("exception occure:"+e1);
			}
		}
		//catch(Exception e)
		//{
			//System.out.println("exception occure:"+e);
		//}
	}


