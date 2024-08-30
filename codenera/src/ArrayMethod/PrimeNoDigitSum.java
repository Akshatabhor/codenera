package ArrayMethod;

public class PrimeNoDigitSum 
{

	public static void main(String[] args)
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
					sum=sum+i;
					
				}
			}
			if(c==2)
			{
				System.out.println(i);
			}
		}
		
	}

}
