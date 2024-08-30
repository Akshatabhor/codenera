package String;

public class reverseWordbyword {

	public static void main(String[] args) 
	{
		String str="i am akshata";
		String s[]=str.split(" ");
		for(int i=0;i<s.length/2;i++)
		{
			String t=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=t;
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+" ");
		}
		
		
		 
	}

}
