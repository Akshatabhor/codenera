package Constructor;
import java.util.Scanner;
public class perfectnumber 
{
	public perfectnumber()
	{
		this.isperfect();
	}
	public void isperfect()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number you want to check:");
		int n=sc.nextInt();
		int a=n;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		
	}
	public void divisiorsum()
	{
		int a=n;
		int sum=0;
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
