package ArrayMethod;
import java.util.Scanner;
public class InputOfArraySum 
{
	public void InputOfArraySum()
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
			sum=sum+a[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("sum of element:"+sum);
		
	}

	public static void main(String[] args)
	{
		System.out.println("method started....");
		InputOfArraySum obj=new InputOfArraySum();
		obj.InputOfArraySum();
		System.out.println("method endeed...");
	}

}
