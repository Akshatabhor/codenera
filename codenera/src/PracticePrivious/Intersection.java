package PracticePrivious;
import java.util.Scanner;
public class Intersection 
{
	public void Intersection()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size1:");
		int size1=sc.nextInt();
		System.out.println("enter the array size2:");
		int size2=sc.nextInt();


		int a[]=new int [size1];
		int b[]=new int [size2];

		System.out.println("enter the first array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the second array:");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}

		System.out.println("intersection of two array:");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					c++;
					break;
				}
			}
			if(c==1)
			{
				System.out.println(a[i]);
			}
		}

	}
	public static void main(String[] args) 
	{
		Intersection obj=new Intersection();
		obj.Intersection();
	}

}
