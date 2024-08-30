package ArrayMethod;
import java.util.*;
public class negative1stpositivelast
{
		public void sortArray(int a[])
		{
			int b[]=new int[a.length];
			int x=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i] < 0)
				{
					b[x++]=a[i];
				}
			}
			int c[]=new int[a.length];
			x=0;
			for(int i=0; i<a.length; i++)
			{
				if(a[i] > 0)
				{
					c[x++]=a[i];
				}
			}
			
			System.out.println(Arrays.toString(b));
			System.out.println(Arrays.toString(c));

			int d[]=new int[a.length];
			x=0;
			for(int i=0; i<a.length; i++)
			{
				if(b[i]!=0)
				{
					d[x++]=b[i];
				}
			}
			
			for(int i=0; i<a.length; i++)
			{
				if(c[i]!=0)
				{
					d[x++]=c[i];
				}
			}
			System.out.println("Modified araay : "+Arrays.toString(d));
		}	

		public static void main(String[] args) 
		{
			int a[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
			negative1stpositivelast obj = new negative1stpositivelast();
			obj.sortArray(a);

		}

	}

