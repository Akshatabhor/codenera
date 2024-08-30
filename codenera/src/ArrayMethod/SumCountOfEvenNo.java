package ArrayMethod;
import java.util.Scanner;
public class SumCountOfEvenNo 
{
	public int SumCountOfEvenNo(int[] a)
	{
		
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("sum of even number:"+sum);

		//return sum;
		return count;
		
	}
	public static void main(String[] args) 
	{
		System.out.println("method started....");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		SumCountOfEvenNo obj=new SumCountOfEvenNo();
		//obj.SumCountOfEvenNo(a);
		int count=obj.SumCountOfEvenNo(a);
		System.out.println("count of even number:"+count);

		System.out.println("method endeed....");
	}

}
