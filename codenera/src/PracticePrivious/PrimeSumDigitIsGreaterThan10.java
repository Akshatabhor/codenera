/*4. Write a Java program to find the sum of the prime numbers between 
 * 100 and 200, but only consider the prime numbers that have a digit 
 * sum greater than 10. Print the sum of those prime numbers.
*/

package PracticePrivious;

public class PrimeSumDigitIsGreaterThan10
{
	public void PrimeSumDigitIsGreaterThan10()
	{
		int first=100;
		int last=200;
		int sum=0;
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
				int rem=0;
				sum=0;
				for(int t=i;t!=0;t=t/10)
				{
					rem=t%10;
					sum=sum+rem;
					
				}
				if(sum>10)
				{
					System.out.println(i+ " "+sum);
				}
				
				
			}
		}
	}
	public static void main(String[] args)
	{
		PrimeSumDigitIsGreaterThan10 obj=new PrimeSumDigitIsGreaterThan10();
				obj.PrimeSumDigitIsGreaterThan10();
	}

}
