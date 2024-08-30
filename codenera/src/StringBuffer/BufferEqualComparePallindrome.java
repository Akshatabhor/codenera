package StringBuffer;
import java.util.Scanner;
public class BufferEqualComparePallindrome {

	public static void main(String[] args) 
	{
		
		StringBuffer sb1= new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java programming");
		if(sb1.equals(sb2))
		{
			System.out.println("both String are equal");
		}
		else
		{
			System.out.println("string are not equal");
		}
		if(sb1.compareTo(sb2)==0)
		{
			System.out.println("both String are equal");
		}
		else
		{
			System.out.println("string are not equal");
		}
		StringBuffer sb=new StringBuffer(sb1);
		sb1.reverse();
		System.out.println("string:"+sb);
		System.out.println("reverse:"+sb1);
		
		if(sb.compareTo(sb1)==0)
		{
			System.out.println("string is pallindrome");
		}
		else 
		{
			System.out.println("string is not pallindrome");
		}
		
		
		
	}

}
