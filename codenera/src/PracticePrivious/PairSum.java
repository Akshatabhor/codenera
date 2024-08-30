package PracticePrivious;
import java.util.Scanner;

public class PairSum 
{
	public void PairSum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=6;
		int count=0;
		System.out.println("pairs of sum is 6:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==sum)
					{
						System.out.println(a[i]+" "+a[j]);
						count++;
					}
			}
		}
		System.out.println("count of pairs:"+count);
	}
	public static void main(String[] args)
	{
		PairSum obj=new PairSum();
		obj.PairSum();
	}

}
