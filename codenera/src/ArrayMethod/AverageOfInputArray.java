package ArrayMethod;
import java.util.Scanner;
public class AverageOfInputArray 
{
	public void AverageOfInputArray()
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
		int avg=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/size;
		}
		System.out.println("enter the sum of element:"+sum);
		System.out.println("enter the avg of element:"+avg);

	}

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		AverageOfInputArray obj=new AverageOfInputArray();
		obj.AverageOfInputArray();
		System.out.println("method endeed...");
	}

}
