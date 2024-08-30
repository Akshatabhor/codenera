package oops;
import java.util.Scanner;
public class pallindromeno 
{
	public void pallindromeno()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();

		int a[]= new int[size];
		
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("palindrome element in array:");

		for(int i=0;i<a.length;i++)
		{
			int rem=0;
			int rev=0;
			for(int j=a[i];j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(a[i]==rev)
			{
				System.out.println(a[i]);
			}
			
		}

	}

	public static void main(String[] args) 
	{
		pallindromeno obj=new pallindromeno();
		System.out.println("main method started........:");
		obj.pallindromeno();
		System.out.println("main method completed.......:");
	}

}
