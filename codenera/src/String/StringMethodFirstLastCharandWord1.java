package String;

import java.util.Scanner;

public class StringMethodFirstLastCharandWord1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		String s[]=str.split(" ");
		//String Fword=s[0];
	//	String Lword=s[s.length-1];
		char FirstChar=str.charAt(0);
		char LastChar=str.charAt(str.length()-1);
		
		int cntFW=0; int cntLW=0; int Fcharcnt=0; int Lcharcnt=0;
		/*for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(Fword))
			{
				cntFW++;
			}
			if(s[i].equals(Lword))
			{
				cntLW++;
			}
		}*/
		for(int i=0;i<str.length();i++)
		{
			if(FirstChar==str.charAt(i))
			{
				Fcharcnt++;
			}
			if(LastChar==str.charAt(i))
			{
				Lcharcnt++;
			}
		}
		
		System.out.println("count of first word:"+cntFW);
		System.out.println("count of last word:"+cntLW);
		System.out.println("count of last char:"+Lcharcnt);
		System.out.println("count of first char:"+Fcharcnt);

	}

}
