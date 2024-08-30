package ArrayMethod;
import java.util.Scanner;
public class NegativeVReplaceLeftSquare 
{
	public int[] NegativeVReplaceLeftSquare(int[] a)
	{
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
		}
		System.out.println("replaycing element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		return a;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the element of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("replace negative value:");
		NegativeVReplaceLeftSquare obj=new NegativeVReplaceLeftSquare();
		a=obj.NegativeVReplaceLeftSquare(a);
	}

}
