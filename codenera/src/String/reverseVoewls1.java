package String;

import java.util.Scanner;

/*Q1. Reverse the vowels only (Flipkart)
 S ="practice"
 Output: prectica
 Explanation: The vowels are a, i, e
 Reverse of these is e, i, a.*/
public class reverseVoewls1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		int x=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]== 'a' | ch[i]=='e'| ch[i]=='i' | ch[i]=='o' | ch[i]=='u')
			{
				ch1[x++]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]== 'a' | ch[i]=='e'| ch[i]=='i' | ch[i]=='o' | ch[i]=='u')
			{
				ch[i]=ch1[--x];
			}
		}
		String s1=new String(ch);
		System.out.println("reverse order voewl:"+s1);
		
	}

}
