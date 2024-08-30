package String;

import java.util.Scanner;

public class StringfrequencyLowest {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.next();
		
		char ch[]=str.toCharArray();
		
	int maxcount=0; char maxchar= '\0';
	char minchar='\0'; 
	int mincount=Integer.MAX_VALUE;
	
	for(int i=0;i<str.length();i++)
	{
		int c=1;
		for(int j=i+1;j<str.length();j++)
		{
			if(ch[i]==ch[j])
			{
				c++;
				ch[j]='\0';
			}
		}
		if(ch[i]!='\0')
		{
			System.out.println(ch[i]+" count:"+c);
			if(c>maxcount)
			{
				maxcount=c;
				maxchar=ch[i];
			}
			if(c<mincount)
			{
				mincount=c;
				minchar=ch[i];
			}
		}
	}
	if(maxchar!='\0')
	{
        System.out.println("Character with highest frequency: " + maxchar + " (count: " + maxcount + ")");

	}
	if(minchar!='\0')
	{
        System.out.println("Character with lowest frequency: " + minchar + " (count: " + mincount + ")");

	}
	
	}

}
