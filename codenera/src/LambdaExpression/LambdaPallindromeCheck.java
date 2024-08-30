package LambdaExpression;

import java.util.Scanner;

interface demo15
{
	public void disp();
}
public class LambdaPallindromeCheck {

	public static void main(String[] args) 
	{
		demo15 ob=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the no");
			int no=sc.nextInt();
			int rem=0;
			int rev=0;
			for(int i=no;i!=0;i=i/10)
			{
				rem=i%10;
				rev=(rev*10)+rem;
			}
			System.out.println("reverse no:"+rev);
			if(no==rev)
			{
				System.out.println(("given no is pallindrome"));
			}
			else
			{
				System.out.println("given no is not pallindrome");
			}
			
		};
		ob.disp();
	}

}
