package ArrayMethod;

import java.util.Scanner;

public class LadderElement 
{
	public void LadderElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Ladder element of array");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					c++;
				}
			}
			if(c==0)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		LadderElement obj=new LadderElement();
		obj.LadderElement();
	}

}
