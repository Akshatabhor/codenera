package String;
import java.util.Scanner;
public class StringMethodFirstLastCharandWord 
{
	public static void FirstWordCount()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String str=sc.nextLine();
			
			String s[]=str.split(" ");
			int c=0;
			String firstWord=s[0];
			for(int i=0;i<s.length;i++)
			{
					if(firstWord.equals(s[i]))
					{
						c++;	
					}
				}
	    System.out.println("Count of occurrences of the first word (" + firstWord + "): " + c);
	    
	  
	    char s1[]=str.toCharArray();
		int c1=0;
		char firstcharcher=s1[0];
		for(int i=0;i<s1.length;i++)
		{
				if(firstcharcher==s1[i])
				{
					c1++;	
				}
			}
	System.out.println("Count of occurrences of the first Character (" + firstcharcher + "): " + c1);
		
		
		String s2[]=str.split(" ");
		int c2=0;
		String LastWord=s2[s2.length-1];
		for(int i=0;i<s2.length;i++)
		{
				if(LastWord.equals(s2[i]))
				{
					c2++;	
				}
			}
	System.out.println("Count of occurrences of the Last word (" + LastWord + "): " + c2);

		char[] s3 = str.toCharArray();
		int c3 = 0;
		char lastCharacter = s3[s3.length - 1];
		for (int i = 0; i < s3.length; i++)
		{
			if (lastCharacter == s3[i]) 
			{
				c3++;    
			}
		}
	System.out.println("Count of occurrences of the last Character (" + lastCharacter + "): " + c3);
		}
		
		public static void main(String[] args) {
			StringMethodFirstLastCharandWord.FirstWordCount();
			
		}

	}

