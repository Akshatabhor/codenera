package Constructor;
import java.util.Scanner;
public class largestprimepallindromeproductitsdigit 
{
	int f,l;
	public largestprimepallindromeproductitsdigit(int f,int l)
	{
		this.f=f;
		this.l=l;
	}
	public void cal()
	{
		int max=0;
		for(int i=f;i<l;i++)
		{
			boolean b = isprime(i);
			if(b==true)
			{
				if(ispall(i)==true)
				{
					if(i>max)
					{
						max=i;
					}
				}
			}
		}
		int ans=this.calprod(max);
		System.out.println("largest pallindrome no:"+max);
		System.out.println("product of largest pallindrome no digit:"+ans);
				
	}
	public int calprod(int n)
	{
		int prod=1,rem=0;
		while(n!=0)
		{
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		return prod;
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
		if(c==0 && n!=1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean ispall(int no)
	{
		int temp=no;
		int rem=0,rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		System.out.println(rev);
		if(rev==no)
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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first and last size:");
		int first = sc.nextInt();
		int last = sc.nextInt();
		largestprimepallindromeproductitsdigit obj=new largestprimepallindromeproductitsdigit(first,last);
		obj.cal();
	}

}
