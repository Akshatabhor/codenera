/*2. Wap to print the prime series between 10-20, but only till two two digit 
 * from starting and find the sum of those two numbers.
  
   input : a=10 , b=20;

   output: 11, 13 
          Sum= 24
*/
package PracticePrivious;

import java.util.Arrays;

public class primeDigitsum 
{
	public void primeDigitsum()
	{
		int first=10;
		int last=20;
		int cnt=0;
		int sum=0;
		for(int i=first;i<=last;i++)
		{
			
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
		
			if(c==0)
			{
				//System.out.println(i);
				cnt++;
				//
				//sum=sum+i;
			}
			
		}
		
		//System.out.println("sum of initial two numbers"+sum);
		int a[]=new int[cnt];
		int x=0;
		
		for(int i=first;i<=last;i++)
		{
			
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
					break;
				}
			}
		
			if(c==0)
			{
				a[x++]=i;
				
			}
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("sum of last two no:"+(a[2]+a[3]));
		
		
		
		
	}

	public static void main(String[] args) 
	{
		primeDigitsum obj=new primeDigitsum();
		obj.primeDigitsum();
	}

}
