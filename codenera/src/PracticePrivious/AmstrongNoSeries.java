package PracticePrivious;
import java.util.Scanner;
public class AmstrongNoSeries 
{
	public void AmstrongNoSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first and last no");
		int first=sc.nextInt();
		int last =sc.nextInt();
		for (int i=first;i<=last;i++)
		{
			int sum=0;
			int rem=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				sum=sum+(rem*rem*rem);
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		AmstrongNoSeries obj=new AmstrongNoSeries();
		obj.AmstrongNoSeries();
	}

}
