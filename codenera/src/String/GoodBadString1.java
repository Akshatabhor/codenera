package String;

import java.util.Scanner;

public class GoodBadString1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		int cnt=0,cnt1=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				cnt++;
			}
			else if(Character.isAlphabetic(ch[i]))
			{
				cnt1++;
			}
		}
		if(cnt>=5 && cnt1<=3)
		{
			System.out.println("String is Good: 1");
		}
		else
		{
			System.out.println("String is Bad");
		}
	}

}
