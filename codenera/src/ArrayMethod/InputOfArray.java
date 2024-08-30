package ArrayMethod;
import java.util.Scanner;
public class InputOfArray 
{
	public void InputOfArray()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		System.out.println("enter the element of array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}	

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		InputOfArray obj=new InputOfArray();
		obj.InputOfArray();
		System.out.println("method ended.....");
		
	}

}
