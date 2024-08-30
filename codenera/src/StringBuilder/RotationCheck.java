package StringBuilder;

public class RotationCheck 
{

	
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="cdab";
		
		//s1=s1+s1;
		//System.out.println(s1.contains(s2)?"true":"false");

		//another method
		
		char c[]=s1.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			char t=c[c.length-1];
			for(int j=c.length-1;j>0;j--)
			{
				c[j]=c[j-1];
			}
				c[0]=t;
				
				String s=String.valueOf(c);
				if(s.equals(s2))
				{
					System.out.println("yes: "+s);
					break;
				}
			}
		}
	}


