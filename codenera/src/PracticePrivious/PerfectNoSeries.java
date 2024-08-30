package PracticePrivious;
import java.util.Scanner;
public class PerfectNoSeries 
{
	public void PerfectNoSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first and last no");
		int first=sc.nextInt();
		int last =sc.nextInt();
		System.out.println("perfect no series:");
		for(int i=first;i<=last;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0)
				{
					sum=sum+j;
				}
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
			
	}

	public static void main(String[] args)
	{
		PerfectNoSeries obj=new PerfectNoSeries();
		obj.PerfectNoSeries();
	}

}
