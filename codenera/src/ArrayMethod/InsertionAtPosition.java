package ArrayMethod;

import java.util.Scanner;

public class InsertionAtPosition
{
	public void InsertionAtPosition()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size:");
		int size = sc.nextInt();

		int a[] = new int[size+1];
		System.out.println("enter the array element:");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the original array:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]+" ");
		}

		System.out.println("enter element to insert in array:");
		int ele=sc.nextInt();

		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=ele;
		System.out.println("insert element at first position");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}


	}
	public static void main(String[] args)
	{
		InsertionAtPosition obj=new InsertionAtPosition();
		obj.InsertionAtPosition();
	}

}
