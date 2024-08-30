/*Q4.Wap enter an array and search any particular element.
 * Q5.WAP to check if an array of integers contains two specified elements. 

*/
package RevisionPractice;
import java.util.Scanner;
public class SearchParticularElement {

	public static void main(String[] args) 
	{
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of Array:");
		int size =sc.nextInt();
		int a[]=new int [size];
		int c=0;
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("which element we want to search");
		int ele=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==ele)
			{
				c++;
				break;
			}
		}
		if(c==1)
		{
			System.out.println("element is  present ");
		}
		else
		{
			System.out.println("element is not present");
		}*/
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the array size");
		int size = sc.nextInt();
		int a[]=new int[size];
		
		System.out.println("enter the element of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
			System.out.println("enter 1st element which you want to search");
			int ele1 = sc.nextInt();
			System.out.println("enter 2nd element which you want to search");
			int ele2 = sc.nextInt();

			int c1=0;
			int c2=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==ele1)
				   c1++;
				if(a[i]==ele2)
				   c2++;
				
			}
			if(c1!=0)
			{
				System.out.println(ele1+" is present "+c1+" times in array");
			}
			else
			{
			System.out.println(ele1+" is notpresent in array");
			}

			if(c2!=0)
			{
				System.out.println(ele2+" is present "+c2+" times in array");
			}
			else
			{
			System.out.println(ele2+" is notpresent in array");
			}
	}

}
