package String;

public class StringMethodUncommonCharacter1 {

	public static void main(String[] args) 
	{
		String s1="geeksforgeeks";
		String s2="geeksquize";
		
		String s3=s1.concat(s2);
		char ch[]=s3.toCharArray();
		
		for(int i=0;i<s3.length();i++)
		{
			int c=0;
			for(int j=i+1;j<s3.length();j++)
			{
				if(ch[i]==ch[j])
				{
					c++;
					ch[j]='\0';
				}
			}
			if(c==0 && ch[i]!='\0')
			{
				System.out.println("uncommon character:"+ch[i]);
			}
		}
		
	}

}
