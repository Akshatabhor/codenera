package StringRevisionPackage;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.nextLine();
		
		int count=countword(input);
			System.out.println("count of word:"+count);	
	}
	public static int countword(String str)
	{
		if(str==null || str.isEmpty())
		{
			return 0;
		}
		String word[]=str.trim().split("\\s+");
		return word.length;
	}

}
