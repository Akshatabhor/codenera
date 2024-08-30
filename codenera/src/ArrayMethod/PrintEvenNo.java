package ArrayMethod;
import java.util.Scanner;
public class PrintEvenNo 
{
	public void PrintEvenNo()
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
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		PrintEvenNo obj=new PrintEvenNo();
		obj.PrintEvenNo();
		System.out.println("method endeed...");
	}

}
