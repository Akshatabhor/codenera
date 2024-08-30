/*5. Write a Java program to generate the prime numbers between 50 and 80, 
 * but only consider the prime numbers that end with a digit greater than 5. 
 * Print the list of those prime numbers."
 */


package PracticePrivious;

public class PrimedDigitGreterthan5 
{
	public void PrimedDigitGreterthan5()
	{
		int first=50;
		int last=80;
		System.out.println("last dgit is greater than 5:");
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
			if(c==2 && i%10>5)
			{
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args)
	{
		PrimedDigitGreterthan5 obj=new PrimedDigitGreterthan5();
		obj.PrimedDigitGreterthan5();
	}

}
