package ArrayMethod;
import java.util.Scanner;
public class ReverseOrderArray 
{
	public void ReverseOrderArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		int b[]=new int[size];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("reverse order:");
		int ind=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[ind]=a[i];
			ind++;
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		ReverseOrderArray obj=new ReverseOrderArray();
		obj.ReverseOrderArray();
	}

}
