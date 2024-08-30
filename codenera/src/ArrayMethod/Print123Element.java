package ArrayMethod;
import java.util.Scanner;
public class Print123Element
{
	public void Print123Element()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//for(int i=0;i<a.length;i++)
		//{
			//System.out.println(a[i]+" ");

		//}
		System.out.println("first element:"+a[0]);
		System.out.println("second element:"+a[1]);
		System.out.println("third element:"+a[2]);

	}

	public static void main(String[] args) 
	{
		System.out.println("method started.....");
		Print123Element obj=new Print123Element();
		obj.Print123Element();
		System.out.println("method completed....");
	}

}
