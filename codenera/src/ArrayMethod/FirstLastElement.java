package ArrayMethod;
import java.util.Scanner;
public class FirstLastElement 
{
	public void FirstLastElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enetr the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		if(size>0)
		{
			System.out.println("first element:"+a[0]);
			System.out.println("last element:"+a[a.length-1]);
		}
		else
		{
			System.out.println("array is empty");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("method started.");
		FirstLastElement obj=new FirstLastElement();
		obj.FirstLastElement();
		System.out.println("method endeed.......");
	}

}
