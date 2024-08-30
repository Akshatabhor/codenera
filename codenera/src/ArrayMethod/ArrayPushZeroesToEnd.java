package ArrayMethod;
import java.util.Scanner;
public class ArrayPushZeroesToEnd
{
	static void pushZerostoEnd(int a[], int n)
	{
		int c = 0;
		for(int i = 0;i < n;i++)
		{
			if(a[i] != 0)
			{
				a[c++] = a[i];
			}
		}
		while(c < n)
		{
			a[c++] = 0;
		}
	}
	static void RearrangeArray(int a[], int n)
	{
		if(n == 1)
		{
			return;
		}
		for(int i = 0;i < n-1;i++)
		{
			if((a[i] != 0) && (a[i] == a[i+1]))
			{
				a[i] = 2*a[i];
				a[i+1] = 0;
				i++;
			}
		}
		pushZerostoEnd(a,n);
	}
	static void  printArray(int a[] , int n)
	{
		for(int i = 0;i < n;i++)
		{
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array 1");
		int s1 = sc.nextInt();
		int a[] = new int[s1];
		System.out.println("Enter size in Array 2");
		int s2 = sc.nextInt();
		int b[] = new int[s2];
		System.out.println("Enter Elements in Array 1");
		for(int i = 0;i < a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		RearrangeArray(a,a.length);
		System.out.println("Modifoed Array : ");
		printArray(a,a.length);
		
		System.out.println("Enter Elements in Array 2");
		for(int i = 0;i < b.length;i++)
		{
			b[i] = sc.nextInt();
		}
		
		RearrangeArray(b,b.length);
		System.out.println("Modifoed Array : ");
		printArray(b,b.length);

	}

}