package ArrayMethod;
import java.util.Scanner;
public class SumCountEvenNoPosition 
{
	public void SumCountEvenNoPosition()
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
		int sum=0;
		int count=0;
		System.out.println("even no position wise:");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				System.out.println(a[i]+" ");
				sum=sum+a[i];
				count++;
			}
		}
		System.out.println("sum of even position:"+sum);
		System.out.println("count of even position:"+count);

	}

	public static void main(String[] args) 
	{
		System.out.println("method started:");
		SumCountEvenNoPosition obj=new SumCountEvenNoPosition();
		obj.SumCountEvenNoPosition();
		System.out.println("method endeed:");
	}

}
