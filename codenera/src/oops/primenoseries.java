package oops;
import java.util.Scanner;
public class primenoseries 
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no");
		int first=sc.nextInt();
		System.out.println("enter the last no");
		int last=sc.nextInt();
		for(int i=first;i<=last;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
		if(c==2 && i%10>5)
		{
			System.out.println("prime no:"+i);
		}
		}
		
		 
		
	}

	public static void main(String[] args) 
	{
		primenoseries obj=new primenoseries();
		obj.run();
	}

}
