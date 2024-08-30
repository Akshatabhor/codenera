package StringBuilder;

public class EvenOdd {

	public static void main(String[] args)
	{
		StringBuffer str=new StringBuffer("abbbcc");
		
		int X=0;
		int Y=0;
		
		for(int i=0;i<str.length();i++)
		{
			int c=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					c++;
					str.deleteCharAt(j);
					j--;
				}
			}
			if(str.charAt(i)%2==0 && c%2==0)
			{
				X++;
			}
			if(str.charAt(i)%2==1 && c%2==1)
			{
				Y++;
			}
			
		}
		if((X+Y)%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");

		}
	}

}
