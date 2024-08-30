package ArrayMethod;

import java.util.Scanner;

public class Anticlockwise
{
	public void Anticlockwise()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size of element:");
		int size=sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the original array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

		int temp=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		a[a.length-1]=temp;

		System.out.println("array after anticlockwise rotation by 1:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}

	public static void main(String[] args) 
	{
		Anticlockwise obj=new Anticlockwise();
		obj.Anticlockwise();
	}

}
