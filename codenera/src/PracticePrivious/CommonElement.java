package PracticePrivious;
import java.util.Scanner;
public class CommonElement 
{
	public void CommonElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array1 ,array2,array3:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int p=sc.nextInt();

		int a[]=new int[n];
		int b[]=new int[m];
		int c[]=new int[p];

		System.out.println("enter the 1st array element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the 2st array element:");
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("enter the 3st array element:");
		for(int i=0;i<p;i++)
		{
			c[i]=sc.nextInt();
		}
		int count=0;
		System.out.println("common element are:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				for(int k=0;k<p;k++)
				{
					if(a[i]==b[j] && b[j]==c[k])
					{
						System.out.println(c[k]+" ");
					}
				}
			}
		}


	}
	public static void main(String[] args) 
	{
		CommonElement obj=new CommonElement();
		obj.CommonElement();
	}

}
