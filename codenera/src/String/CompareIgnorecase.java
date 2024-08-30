package String;

public class CompareIgnorecase {

	public static void main(String[] args) 
	{
		String s1="This is Excerise 1";
		String s2="This is Excerise 1";
		
		int result=s1.compareTo(s2);
		if(result==0)
		{
			System.out.println("s1 & s2 are equal");
		}
		else if(result<0)
		{
			System.out.println("s1 is less than s2");
		}
		else
		{
			System.out.println("s1 is greater than s2 ");
		}
				
				
	}

}
