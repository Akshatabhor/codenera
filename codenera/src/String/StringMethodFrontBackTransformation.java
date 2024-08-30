package String;

public class StringMethodFrontBackTransformation {

	public static void main(String[] args)
	{
		String s="Hello";
		
		int startcap=65;
		int endcap=90;
		int startsmall=97;
		int endsmall=122;
		
		for(int i=0;i<s.length();i++)
		{
			if(Character.isUpperCase(s.charAt(i)))
			{
				int asciiCurrentChar=s.charAt(i);
				int diff=asciiCurrentChar-startcap;
				int expChar=endcap-diff;
				System.out.print((char)expChar);
				
			}
			if(Character.isLowerCase(s.charAt(i)))
			{
				int asciiCurrentChar=s.charAt(i);
				int diff=asciiCurrentChar-startsmall;
				int expChar=endsmall-diff;
				System.out.print((char)expChar);
				
			}
		}
	}

}
