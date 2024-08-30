package PracticePrivious;
import java.util.Scanner;
public class PrimeNoCheck 
{
	public void PrimeNoCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int c=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.println("given no is primeno");
		}
		else
		{
			System.out.println("given no is not primeno");
		}
	}

	public static void main(String[] args) 
	{
		PrimeNoCheck obj=new PrimeNoCheck();
		obj.PrimeNoCheck();
	}

}
