package PracticePrivious;
import java.util.Scanner;
public class PerfectNocheck 
{
	public void PerfectNocheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==no)
		{
			System.out.println("given no is perfect");
		}
		else
		{
			System.out.println("given no is not perfect");
		}
	}
	public static void main(String[] args) 
	{
		PerfectNocheck obj=new PerfectNocheck();
		obj.PerfectNocheck();
	}

}
