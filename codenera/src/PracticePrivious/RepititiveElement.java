package PracticePrivious;
import java.util.Scanner;
public class RepititiveElement 
{
	public void RepititiveElement()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size =sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp=a[i];
					count++;
					break;
				}
			}
			if(count>0)
			{
				break;
			}
		}
		System.out.println("repiting element:"+temp);

	}

	public static void main(String[] args) 
	{
		RepititiveElement obj=new RepititiveElement();
		obj.RepititiveElement();
		
	}

}
