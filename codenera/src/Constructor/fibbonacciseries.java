package Constructor;
import java.util.Scanner;
public class fibbonacciseries 
{
	public fibbonacciseries()
	{
		this.fibbonacciseries();
	}
	public void fibbonacciseries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range of fibbonacci series:");
		int n=sc.nextInt();
		int a=0;
		int b=1,sum=0;
		for(int i=0;i<=n;i++)
		{
			System.out.println(a+" ");
			if(a%2==0)
			{
				sum=sum+a;
			}
			int c=a+b;
			a=b;
			b=c;
		}
		
		System.out.println("sum of even digit:"+sum);

	}
	
	public static void main(String[] args) 
	{
		fibbonacciseries obj =new fibbonacciseries();
		
	}

}
