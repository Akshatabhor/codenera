/*8. WAP to print the series of prime number between 1 to 100, now 
 * store all the prime number into array and remove all the prime number 
 * who's sum is greater than 5. 
*/
package PracticePrivious;

import java.util.Arrays;

public class PrimeSeriesstoreArrayDigitSumGreater5 
{
	public void PrimeSeriesstoreArrayDigitSumGreater5()

	{
		int first=1;
		int last=100;
		int sum=0;
		int cnt=0;
		for(int i=first;i<=last;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				//System.out.println(i);
				int rem=0;
				sum=0;
				for(int t=i;t!=0;t=t/10)
				{
					rem=t%10;
					sum=sum+rem;
					
				}
				//System.out.println(i+" "+sum);
				if(sum<5)
				{
					cnt++;
				}
			}
		}
		int a[]=new int[cnt];
		int x=0;
		for(int i=first;i<=last;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				//System.out.println(i);
				int rem=0;
				sum=0;
				for(int t=i;t!=0;t=t/10)
				{
					rem=t%10;
					sum=sum+rem;
					
				}
				//System.out.println(i+" "+sum);
				if(sum<5)
				{
					
					a[x++]=i;
				}
			}
		}
		System.out.println(Arrays.toString(a));

		
	}
	public static void main(String[] args) 
	{
		PrimeSeriesstoreArrayDigitSumGreater5 obj=new PrimeSeriesstoreArrayDigitSumGreater5();
		obj.PrimeSeriesstoreArrayDigitSumGreater5();
	}

}
