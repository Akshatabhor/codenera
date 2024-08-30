package String;

public class StringMethodReverseVowel 
{

	public static void main(String[] args) 
	{
		String str="practice";
		
		char ch[]=str.toCharArray();
		
		char c[]=new char[ch.length];
		int ind=0;
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				c[ind++]=ch[i];
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				ind--;
				ch[i]=c[ind];
			}
		}
		String newstr=new String(ch);
		System.out.println("After vowel reverse:"+newstr);
	}

}
