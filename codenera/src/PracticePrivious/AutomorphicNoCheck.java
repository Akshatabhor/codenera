package PracticePrivious;
import java.util.Scanner;
public class AutomorphicNoCheck
{
	public void AutomorphicNoCheck()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int no=sc.nextInt();
		int count=0;
		int temp=no;
		int square=no*no;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		int lastDigit = (int) (square%(Math.pow(10, count)));   
		if(no==lastDigit)
		{
			System.out.println("given no is automorphic no");
		}
		else 
		{
			System.out.println("given no is not automorphic");
		}
	}
	public static void main(String[] args) 
	{
		AutomorphicNoCheck obj=new AutomorphicNoCheck();
		obj.AutomorphicNoCheck();
	}

}
