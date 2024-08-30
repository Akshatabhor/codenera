package Pattern;

public class XPattern40 {

	public static void main(String[] args) 
	{
		int n=5;
		int i=1;
		while(i<n)
		{
			int j=1;
			while(j<=5-i)
			{
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i*2-1)
			{
				System.out.print("*");
				k++;
			}
			i++;
			System.out.println();
		}
		
		
		while(i>=1)
		{
			int j=1;
			while(j<=5-i)
			{
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i*2-1)
			{
				System.out.print("*");
				k++;
			}
			i--;
			System.out.println();
		}

	}

}
