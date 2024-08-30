package RevisionPractice;

public class PallindromeSeries {

	public static void main(String[] args) 
	{
		for(int i=100;i<200;i++)
		{
			int rev=0;
			int rem=0;
			for(int j=i;j!=0;j=j/10)
			{
				rem=j%10;
				rev=(rev*10)+rem;
			}
			if(i==rev)
			{
				System.out.println(rev);
			}
		}
	}

}
