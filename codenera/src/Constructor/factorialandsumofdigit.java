package Constructor;
import java.util.Scanner;
public class factorialandsumofdigit 
{
	public factorialandsumofdigit()
	{
		this.calfactorial();
		
	}
	
	public void calfactorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to factorial:");
		int n=sc.nextInt();
		
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial number is:"+fact);
		this.sumdigit(fact);
	}

	public void sumdigit(int a)
	{
		int sum=0,rem=0;
		while(a!=0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		System.out.println("sum of digit is:"+sum);

	}

	public static void main(String[] args) 
	{
		
		factorialandsumofdigit obj=new factorialandsumofdigit();
	
		
		
	}

}
