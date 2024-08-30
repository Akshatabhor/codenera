package StringBuilder;

import java.util.Scanner;

public class LongestPalindronicSubstring 
{
	public static boolean ispall(StringBuffer sb)
	{
		StringBuffer sb1=new StringBuffer(sb);
		sb.reverse();
		if(sb.compareTo(sb1)==0)
		return true;
		else
			return false;
	}
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("babad");
		while(!LongestPalindronicSubstring.ispall(sb))
		{
			sb.deleteCharAt(sb.length()-1);
		}
		System.out.println(sb);
		
	}

}
