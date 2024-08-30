package Recursion;

public class PallindromCheckRecursion 
{

	public static void main(String[] args) 
	{
		boolean isPallindrome=isPallindrome(0,3,"abba");
		System.out.println(isPallindrome);
	}
	public static boolean isPallindrome (int i, int j, String str)
	{
		if(i>=j)
		{
			return true;
		}
		if(str.charAt(i)!=str.charAt(j))
		{
			return false;
		}
		i=i+i;
		j=j-1;
		return isPallindrome(i+1,j-2,str);
		
	}

}
