package String;

import java.util.Scanner;

public class FindDuplicatecharacter 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		System.out.println("dublicate character are:");
		
		for(int i=0;i<ch.length;i++)
		{
			int c=1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j] && ch[i]!='0')
				{
					c++;
					ch[j]='0';
				}
			}
			if(c>1 )
			{
				System.out.println(ch[i]);
			}
		}
	}

}
