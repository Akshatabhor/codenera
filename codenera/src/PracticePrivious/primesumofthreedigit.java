/*3. Write a Java program to find the sum of the prime numbers 
 * between 30 and 50, but only consider the first three prime numbers
 *  in the range. Print the sum of those three prime numbers.
*/

package PracticePrivious;

public class primesumofthreedigit 
{
	public void primesumofthreedigit()
	{
		int first=30;
		int last=50;
		int cnt=0;
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
			if(c==2 && cnt<3)
			{
				System.out.println(i);
				cnt++;
				sum=sum+i;
			}
		}
		System.out.println("sum of three element:"+sum);
	}

	public static void main(String[] args) 
	{
		primesumofthreedigit obj=new primesumofthreedigit();
		obj.primesumofthreedigit();
		
	}

}
