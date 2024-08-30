package oops;
import java.util.Scanner;
public class primecheckarrayusingthis 
{
	int a[];
	public primecheckarrayusingthis()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		a=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	public void disp()
	{
		System.out.println("enter the array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public void calprime()
	{
		System.out.println("prime no in array:");
		for(int i=0;i<a.length;i++)
		{
			boolean p=this.isprime(a[i]);
			if(p==true)
			{
				System.out.println(a[i]);
			}
		}
	}
	public boolean isprime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0 && n!=0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) 
	{
		primecheckarrayusingthis obj=new primecheckarrayusingthis();
		obj.disp();
		obj.calprime();
	}

}
