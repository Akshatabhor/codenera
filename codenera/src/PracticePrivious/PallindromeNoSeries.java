package PracticePrivious;
import java.util.Scanner;
public class PallindromeNoSeries 
{
	public void PallindromeNoSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first and last no");
		int first=sc.nextInt();
		int last=sc.nextInt();
		for(int i=first;i<last;i++)
		{
			int rem=0;
			int rev=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(i==rev)
			{
				System.out.println(rev);
			}
		}
	}
	public static void main(String[] args) 
	{
		PallindromeNoSeries obj=new PallindromeNoSeries();
		obj.PallindromeNoSeries();
	}

}
