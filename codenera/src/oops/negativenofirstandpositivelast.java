package oops;
import java.util.Scanner;
public class negativenofirstandpositivelast 
{
	public void negativenofirstandpositivelast()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the elemnt of array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int left=0;
		int right=a.length-1;
		while(left<=right)
		{
			if(a[left]<0)
			{
				left++;
			}
			else if(a[right]>0)
			{
				right--;
			}
			else
			{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
				
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	
	public static void main(String[] args) 
	{
		negativenofirstandpositivelast obj=new negativenofirstandpositivelast();
		obj.negativenofirstandpositivelast();
	}

}
