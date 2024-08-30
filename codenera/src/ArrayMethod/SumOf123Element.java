package ArrayMethod;
import java.util.Scanner;
public class SumOf123Element 
{
	public void SumOf123Element()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.println(a[i]+" ");

		//}
		System.out.println("first element:"+a[0]);
		System.out.println("second element:"+a[1]);
		System.out.println("third element:"+a[2]);
		sum=sum+a[0]+a[1]+a[2];
		System.out.println("sum of the first second third element: "+sum);
	}

	public static void main(String[] args) 
	{
		System.out.println("method started..");
		SumOf123Element obj=new SumOf123Element();
		obj.SumOf123Element();
		System.out.println("method completed...");
	}

}
