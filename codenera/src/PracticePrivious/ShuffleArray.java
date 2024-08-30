package PracticePrivious;
import java.util.*;
public class ShuffleArray
{
	public void ShuffleArray()
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
		Random obj=new Random();
		for(int i=0;i<a.length;i++)
		{
			int ind=obj.nextInt(a.length);
			int t=a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		System.out.println("shuffle array");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		
	}
	public static void main(String[] args) 
	{
		ShuffleArray obj=new ShuffleArray();
		obj.ShuffleArray();
	}

}
