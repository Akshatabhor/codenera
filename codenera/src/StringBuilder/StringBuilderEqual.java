package StringBuilder;

public class StringBuilderEqual {

	public static void main(String[] args)
	{
		StringBuilder sb1=new StringBuilder("java");
		StringBuilder sb2=new StringBuilder("java");

		if(sb1.equals(sb2))
		{
			System.out.println("both String are equal");
		}
		else
		{
			System.out.println("both String are not equal");

		}
		if(sb1.compareTo(sb2)==0)
		{
			System.out.println("both String are equal");

		}
		else
		{
			System.out.println("both String are not equal");

		}
	}

}
