package String;

import java.util.Scanner;

public class StringMethodRepetedCharacter {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
	
		char ch[]=str.toCharArray();
		
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("repeted character are:"+ch[i]);
					count++;
				}
			}
		}
		System.out.println("count of repeted character are:"+count);
		
	}

}
