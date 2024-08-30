package ArrayMethod;
import java.util.Scanner;
public class SumCountOfOddNo 
{
	public void SumCountOfOddNo()
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
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==1)
			{
				System.out.println(a[i]);
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("sum of even number:"+sum);
		System.out.println("count of even no:"+count);
	}
	public static void main(String[] args) 
	{
		System.out.println("method started....");
		SumCountOfOddNo obj=new SumCountOfOddNo();
		obj.SumCountOfOddNo();
		System.out.println("method endeed...");
	}

}
