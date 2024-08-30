package ArrayMethod;
import java.util.Scanner;
public class SumOfOddN0 
{
	public void SumOfOddN0()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("even number are:");
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]+" ");
				sum=sum+a[i];
			}
		}
		System.out.println("sum of odd number:"+sum);
		
	}
	public static void main(String[] args) 
	{
		System.out.println("method started...");
		SumOfOddN0 obj=new SumOfOddN0();
		obj.SumOfOddN0();
		System.out.println("method completed...");
	}

}
