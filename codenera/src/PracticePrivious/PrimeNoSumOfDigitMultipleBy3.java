/*6. Write a Java program to generate the prime numbers between 500 and 600, 
 * but only consider the prime numbers where the sum of their digits is a 
 * multiple of 3. Print the list of those prime numbers.

*/

package PracticePrivious;

public class PrimeNoSumOfDigitMultipleBy3 
{
	public void PrimeNoSumOfDigitMultipleBy3()
	{
		int first=500;
		int last=600;
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
				//System.out.println(i);
				int rem=0;
				sum=0;
				for(int t=i;t!=0;t=t/10)
				{
					rem=t%10;
					sum=sum+rem;
				}
				if(sum%3==0)
				{
					System.out.println(i+" "+sum);
				}
				else
				{
					System.out.println(i+" "+sum);
				}
				
			}
			
		}
	}

	public static void main(String[] args) 
	{
		PrimeNoSumOfDigitMultipleBy3 obj=new PrimeNoSumOfDigitMultipleBy3();
		obj.PrimeNoSumOfDigitMultipleBy3();
	}

}
