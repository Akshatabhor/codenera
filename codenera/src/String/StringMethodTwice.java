package String;

public class StringMethodTwice {

	public static void main(String[] args)
	{
		String s[]={"Greeks", "For","Greeks"};
		
		for(int i=0;i<s.length;i++)
		{
			int c=1;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i]==s[j])
				{
					c++;
				}
			}
			if(c==2)
			{
				//System.out.println("twice String:"+s[i]);
				System.out.println("1");
				break;
			}
		}
	}

}
