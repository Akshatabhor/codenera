package oops;
import java.util.Scanner;
public class factorialno 
{
	public void factorialno()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int no =sc.nextInt();
		int fact=1;
		while(no>1)
		{
			fact=fact*no;
			no--;
		}
		System.out.println("factorial of given no is:"+fact);
	}

	public static void main(String[] args) 
	{
		factorialno obj=new factorialno();
		System.out.println("method started.......:");
		obj.factorialno();
		System.out.println("method completed.........:");
	}

}
