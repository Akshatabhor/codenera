package oops;
import java.util.Scanner;
public class methodreternwithnoarg 
{
	public int add()
	{
		int ans=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		ans=a+b;
		
		return ans;
	}
	public static void main(String[] args) 
	{
		methodreternwithnoarg obj=new methodreternwithnoarg();
		int ans=obj.add();
		System.out.println("addition of two numbers:"+ans);
	}

}
