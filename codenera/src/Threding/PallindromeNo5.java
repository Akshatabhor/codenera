package Threding;

import java.util.Scanner;

class Palindromenum
{
	public void palindrome(int start,int end)
	{
		
		for(int i=start;i<=end;i++)
		{
			int rem=0;int rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=rev*10+rem;
			}
			if(rev==i)
			{
				System.out.print(i+" ");
				PallindromeNo5.sum=PallindromeNo5.sum+i;
			}
		}
		System.out.println("Sum of Palindrome number:"+PallindromeNo5.sum);
			
	}
}

public class PallindromeNo5 extends Thread{
	int start,end;
	static int sum=0;
	static Palindromenum obj;
	PallindromeNo5(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
	public void run()
	{
		obj.palindrome(start, end);
	}
	
	public static void main(String[] args)  throws Exception{
		obj=new Palindromenum();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start number");
		int n1=sc.nextInt();
		System.out.println("Enter End Number");
		int n2=sc.nextInt();
		PallindromeNo5 t1=new PallindromeNo5(0,n2/2);
		PallindromeNo5 t2=new PallindromeNo5(n2/2,n2);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}

}

