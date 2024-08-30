package String;

public class StringCompareTo1 {

	public static void main(String[] args)
	{
		String str="ABCD";
		String str1="abcd";
		if(str.compareTo(str1)<0)
		{
			System.out.println("str1 is greater than str");
		}
		else if(str.compareTo(str1)>0)
		{
			System.out.println("str is greater than str1");
		}
		else
		{
			System.out.println("both string are equal");
		}
	}

}
