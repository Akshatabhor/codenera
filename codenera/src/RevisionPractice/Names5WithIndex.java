package RevisionPractice;

import java.util.Scanner;

public class Names5WithIndex {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of name ");
		int size =sc.nextInt();
		
		String a[]=new String[size];
		
		System.out.println("enter the name ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("name with index:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" "+a[i]);
		}
	}

}
