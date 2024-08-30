/*Find a peak element which is not smaller than its neighbours*/

package PracticePrivious;
import java.util.Scanner;
public class PeakElement
{
	public void PeakElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Peak Element:");
		for(int i=0;i<a.length;i++)
		{
			if(i!=0 && i!=a.length-1)
			{
				if(a[i]>a[i-1]  && a[i]>a[i+1])
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		PeakElement obj=new PeakElement();
		obj.PeakElement();

	}

}
