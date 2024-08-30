package String;

public class StringCompareToIgnore {

	public static void main(String[] args) 
	{
		String str="ABCD";
		String str1="akshata";
		if(str.compareToIgnoreCase(str1)<0)
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
