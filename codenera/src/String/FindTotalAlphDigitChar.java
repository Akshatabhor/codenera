package String;

import java.util.Scanner;

public class FindTotalAlphDigitChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		int Alphacount=0;
		int DigitCount=0;
		int SpecialCharCount=0;
		
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				Alphacount++;
			}
			else if(ch>='0' && ch<='9')
			{
				DigitCount++;
			}
			else
			{
				SpecialCharCount++;
			}
		}
		System.out.println("total alphabet:"+Alphacount);
		System.out.println("total digit:"+DigitCount);
		System.out.println("total special character:"+SpecialCharCount);

	}

}
