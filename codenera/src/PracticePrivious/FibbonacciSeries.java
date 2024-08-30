package PracticePrivious;
import java.util.Scanner;
public class FibbonacciSeries 
{
	public void FibbonacciSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=1;i<=no;i++)
		{
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}

	public static void main(String[] args) 
	{
		FibbonacciSeries obj=new FibbonacciSeries();
		obj.FibbonacciSeries();
	}

}
