package ArrayMethod;
import java.util.Scanner;
public class Print0PositiveNegativeno 
{
	public void Print0PositiveNegativeno()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter the array element:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int zerocount=0;
		int positiveno=0;
		int negativeno=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				zerocount++;
			}
			else if(a[i]>0)
			{
				positiveno++;
			}
			else
			{
				negativeno++;
			}
		}
		System.out.println("zero number:"+zerocount);
		System.out.println("positive number:"+positiveno);
		System.out.println("negative number:"+negativeno);

	}

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		Print0PositiveNegativeno obj=new Print0PositiveNegativeno();
		obj.Print0PositiveNegativeno();
		System.out.println("method endeed...");
	}

}
