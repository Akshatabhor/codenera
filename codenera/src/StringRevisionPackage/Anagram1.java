package StringRevisionPackage;

import java.util.Arrays;

public class Anagram1
{
	public static void main(String[] args) {
		String str1="Race";
		String str2="caraw";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str2.length())
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
		boolean result=Arrays.equals(ch1, ch2);
		
		if(result)
		{
			System.out.println("given string is anagram");
		}
		else
		{
			System.out.println("given string is not anagram");
		}
		}
	}

}
