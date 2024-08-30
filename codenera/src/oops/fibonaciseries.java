package oops;
import java.util.Scanner;
public class fibonaciseries 
{
	public void calfibboseries(int n)
	{
	
	int a=0;
	int b=1;
	int c=0;
	System.out.println("fibbonaci series:");
	for(int i=0;i<n;i++)
	{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
	}

	public static void main(String[] args) 
	{
		fibonaciseries obj=new fibonaciseries();
		System.out.println("enter the no:");
		Scanner sc =new Scanner(System.in);
		int a=sc.nextInt();
		obj.calfibboseries(a);
		}

}
