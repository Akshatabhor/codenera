package PracticePrivious;
import java.util.Scanner;
public class ClockWiseRotation 
{
	public void ClockWiseRotation()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size of element:");
		int size=sc.nextInt();

		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}

		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--)
		{
			a[i]=a[i-1];
		}
		a[0]=temp;

		System.out.println("array after clockwise rotation by 1:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		ClockWiseRotation obj=new ClockWiseRotation();
		obj.ClockWiseRotation();
	}

}
