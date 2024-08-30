package oops;
import java.util.Scanner;
public class primearraywithreturnwitharg 
{
	public int[] primearray(int a[])
	{
		int cnt=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0 && a[i]!=1)
			{
				System.out.println(a[i]);
				cnt++;
			}
		}
		int prime[]=new int[cnt];
		System.out.println(cnt);
		int ind=0;
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
					break;
					
				}
			}
				if(c==0 && a[i]!=1)
				{
					prime[ind]=a[i];
					ind++;
				}
			
		}
		return prime;
	}

	public static void main(String[] args) 
	{
		primearraywithreturnwitharg obj=new primearraywithreturnwitharg();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int p[]=obj.primearray(a);
		System.out.println("prime array:"+p.length);
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i]);
		}

	}

}
