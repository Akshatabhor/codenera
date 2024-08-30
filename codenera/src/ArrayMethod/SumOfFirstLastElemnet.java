package ArrayMethod;
import java.util.Scanner;
public class SumOfFirstLastElemnet 
{
	public void SumOfFirstLastElemnet()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enetr the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		if(size>0)
		{
			System.out.println("first element:"+a[0]);
			System.out.println("last element:"+a[a.length-1]);
			int sum=a[0]+a[a.length-1];
			System.out.println("sum of first and last element:"+sum);
		}
		else
		{
			System.out.println("array is empty");
		}
		}

	public static void main(String[] args) 
	{
		System.out.println("method started.....");
		SumOfFirstLastElemnet obj=new SumOfFirstLastElemnet();
		obj.SumOfFirstLastElemnet();
		System.out.println("method endeed.....");

	}

}
