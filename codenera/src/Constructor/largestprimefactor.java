package Constructor;

import java.util.Scanner;

public class largestprimefactor {
	
	public largestprimefactor()
	{
		this.Factor();
	}
	public void Factor()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();int  max=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0 && this.prime(i))
			{
				if(i>max)
					max=i;
				
				}
			}
		System.out.println("Maximun of primeFactor:"+max);
		}
	public boolean prime(int n)
	{
		boolean c=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
					c=false;
					break;
			}
		}
			return c;
		}
	public static void main(String[] args) {
		largestprimefactor obj=new largestprimefactor();
	}

}
