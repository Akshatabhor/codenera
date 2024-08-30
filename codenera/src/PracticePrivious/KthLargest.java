package PracticePrivious;
import java.util.Scanner;
public class KthLargest 
{
	public void KthLargest()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size =sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("enter the element of array:");
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			b[count++]=a[i];
		}
		System.out.println("enter the k'th position:");
		int k=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(b[i]<b[j])
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
		System.out.println("k'th largest elemnt: "+b[k-1]);
		
	}

	public static void main(String[] args) 
	{
		KthLargest obj=new KthLargest();
		obj.KthLargest();
	}

}
