package ArrayMethod;

import java.util.Scanner;

public class TwoSpecifiedElement 
{
	public void TwoSpecifiedElement()
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
		System.out.println("enter the first element you want to search:");
		int ele1=sc.nextInt();
		System.out.println("enetr second elemnet you want to search:");
		int ele2=sc.nextInt();
		int c1=0;
		int c2=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele1)
				c1++;
			if(a[i]==ele2)
				c2++;
		}
		if(c1!=0)
		{
			System.out.println(ele1+"is present" +c1+ "times in array");
		}
		else
		{
			System.out.println("ele1 is not present in array");
		}
		if(c2!=0)
		{
			System.out.println(ele2+"is present" +c2+ "times in array");
		}
		else
		{
			System.out.println("ele2 is not present in array");
		}
	}
	public static void main(String[] args) 
	{
		TwoSpecifiedElement obj=new TwoSpecifiedElement();
		obj.TwoSpecifiedElement();
	}

}
