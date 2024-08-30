package String;

public class StringMethodPercentage 
{
	public static void getCharPercentage(String str)
	{
		int length=str.length();
		
		int upperCaseCount=0;
		int lowerCaseCount=0;
		int digits=0;
		int specChars=0;
		for(int i=0;i<length;i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch))
			{
				upperCaseCount++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowerCaseCount++;
			}
			else if(Character.isDigit(ch))
			{
				digits++;
			}
			else
			{
				specChars++;
			}
		}
		double upperCasePercentage=(upperCaseCount*100)/length;
		double lowerCasepercentage=(lowerCaseCount*100)/length;
		double digitsPercentage=(digits*100)/length;
		double specCharsPercentage=(specChars*100)/length;
		
		System.out.println("uppercase percentage:"+upperCasePercentage);
		System.out.println("lowercase percentage:"+lowerCasepercentage);
		System.out.println("digit percentage:"+digitsPercentage);
		System.out.println("specialcharacter percentage:"+specCharsPercentage);
	}

	public static void main(String[] args)
	{
		getCharPercentage("Akshata123@gmail.com");
	}

}
