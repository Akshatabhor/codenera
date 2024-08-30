package String;

import java.util.Scanner;

public class StringMethodVowelConsnant {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		str=str.toLowerCase();
		int cntvowel=0;
		int cntcons=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' ||ch=='u')
			{
				cntvowel++;
			}
			else
			{
				cntcons++;
			}
		}
		System.out.println("count of vowel:"+cntvowel);
		System.out.println("count of cnsonant:"+cntcons);

	}

}
