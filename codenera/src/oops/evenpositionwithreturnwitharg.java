package oops;
import java.util.Scanner;
public class evenpositionwithreturnwitharg 
{
	public int evenpositionwithreturnwitharg(int[] a)
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				if(i+1%2==1)
				{
					System.out.println(a[i]+" ");
					sum=sum+a[i];
				}
			}
			return sum;
			
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size of array:");
			int size=sc.nextInt();
			int a[]=new int[size];
			System.out.println("enter the element of array:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			oddnumberwithreturnwitharg obj=new oddnumberwithreturnwitharg();
			int sum=obj.oddnumberwithreturnwitharg(a);
			System.out.println("sum of odd no:"+sum);
			
		}

	}

	

