package PracticePrivious;
import java.util.Scanner;
public class PrimeSeriesNo 
{
	public void PrimeSeriesNo()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first and last no");
		int first=sc.nextInt();
		int last=sc.nextInt();
		System.out.println("prime no");
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
			if(c==2)
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		PrimeSeriesNo obj=new PrimeSeriesNo();
		obj.PrimeSeriesNo();
	}

}
