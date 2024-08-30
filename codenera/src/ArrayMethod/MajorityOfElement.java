package ArrayMethod;

import java.util.Scanner;

public class MajorityOfElement 
{
	public void MajorityOfElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("element appear more than "+n/2+"");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>n/2)
			{
				System.out.println(a[i]+" ");
			}
		}
		
	}
	public static void main(String[] args) 
	{
		MajorityOfElement obj=new MajorityOfElement();
		obj.MajorityOfElement();
	}

}
