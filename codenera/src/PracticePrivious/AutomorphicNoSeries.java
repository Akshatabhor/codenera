package PracticePrivious;
import java.util.Scanner;
public class AutomorphicNoSeries
{
	public void AutomorphicNoSeries()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first last element");
		int no=sc.nextInt();
		int count=0;
		int temp=no;
		int square=no*no;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int lastdigit=(int)(square%(Math.pow(10, count)));
		if(no==lastdigit)
		{
			System.out.println(no);
		}
		for(int i=1;i<1000;i++)
		{
			System.out.println(i);
		}
		
		
	}
	public static void main(String[] args) 
	{
		AutomorphicNoSeries obj=new AutomorphicNoSeries();
		obj.AutomorphicNoSeries();
		
	}

}
