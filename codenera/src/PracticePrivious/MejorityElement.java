package PracticePrivious;
import java.util.Scanner;
public class MejorityElement 
{
	public void MejorityElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();

		int a[]=new int[n];

		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements appear more then "+n/2+" are:");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c>n/2)
			{
				System.out.println(a[i]+" ");
			}
		}

	}
	public static void main(String[] args) 
	{
		MejorityElement obj=new MejorityElement();
		obj.MejorityElement();
		
	}

}
