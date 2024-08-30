package oops;
import java.util.Scanner;
public class methodreturnwitharg 
{
	public int add(int a,int b)
	{
		int c=a+b;
		
		return c;
		
	}
	public static void main(String[] args) 
	{
		methodreturnwitharg obj=new methodreturnwitharg();
		System.out.println("main method started....");
		int c=obj.add(10,20);
		System.out.println("addition of two no:"+c);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int ans=obj.add(a,b);
		System.out.println("addition of two number:"+ans);
		System.out.println("main method completed.......");
	}

}
