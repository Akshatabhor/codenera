package ArrayMethod;
import java.util.Scanner;
public class AverageOfFirst5Element 
{
	public void AverageOfFirst5Element()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		int avg=0;
		int count=Math.min(size, 5);
		for(int i=0;i<count;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/count;
		System.out.println("sum of first 5 element:"+sum);
		System.out.println("avg of first 5 element:"+avg);

	}

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		AverageOfFirst5Element obj=new AverageOfFirst5Element();
		obj.AverageOfFirst5Element();
		System.out.println("method completed......");
	}

}
