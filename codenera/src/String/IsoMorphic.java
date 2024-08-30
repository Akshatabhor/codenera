package String;
import java.io.*;
import java.util.HashMap;

public class IsoMorphic
{
	static boolean CheckIsomorphic(String str1,String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		} 
		HashMap<Character,Character> h1 = new HashMap<>();
		for(int i = 0;i < str1.length();i++)
		{
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			
			if(h1.containsKey(ch1))
			{
				if(h1.get(ch1) != ch2)
				{
					return false;
				}
			}
			else
			{
				if(h1.containsValue(ch2))
				{
					return false;
				}
				h1.put(ch1, ch2);
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		String s1 = "aab";
		String s2 = "xxy";
		
		boolean ans = CheckIsomorphic(s1,s2);
		if(ans != false)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

	}

}