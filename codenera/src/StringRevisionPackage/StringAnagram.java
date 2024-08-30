package StringRevisionPackage;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
	public char[] converStringToCharArray(String str)
	{
		char s[]=str.toCharArray();
		return s;
	}
	public char[] sortedArray(char a[])
	{
		Arrays.sort(a);
		return a;
	}
	public String convertArrayToString(char s1[])
	{
		String str=new String(s1);
		return str;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two strings: ");
		String str1=sc.next();
		str1.toLowerCase();
		String str2= sc.next();
		str2.toLowerCase();
		StringAnagram obj = new StringAnagram();
		char s1[] =obj.converStringToCharArray(str1);
		char s2[] =obj.converStringToCharArray(str2);
		
		char sortS1[]=obj.sortedArray(s1);
		char soerS2[]=obj.sortedArray(s2);
		
		String s3=obj.convertArrayToString(sortS1);
		String s4=obj.convertArrayToString(soerS2);
		
		if(s3.equals(s4))
		{
			System.out.println("Given strings are Anagram strings");
		}
		else
		{
			System.out.println("Given strings are Not Anagram strings");
		}

	}

}