package String;

public class StringMethodUncommonCharacter {

	public static void main(String[] args) 
	{
		String str1="geeksforgeeks";
		String str2="geeksquiz";
		
		String str3=str1.concat(str2);
		char ch[]=str3.toCharArray();
		
		System.out.println("uncommon character:");
		for(int i=0;i<ch.length;i++)
		{
			int c=0;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
			}
			if(c==0  && ch[i]!='\0')
			{
				System.out.print(ch[i]+" ");
			}
		}
		
		
		
	}

}
