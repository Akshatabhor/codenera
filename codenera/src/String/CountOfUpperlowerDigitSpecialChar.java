package String;

import java.util.Scanner;

public class CountOfUpperlowerDigitSpecialChar {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String str=sc.nextLine();
		int uppercase=0;
		int lowercase=0;
		int digit=0;
		int specialchar=0;
		
		for(char ch:str.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				uppercase++;
			}
			else if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else
			{
				specialchar++;
			}
			
		}
		System.out.println("uppercase count:"+uppercase);
		System.out.println("lowercase count:"+lowercase);
		System.out.println("digit count:"+digit);
		System.out.println("special character count:"+specialchar);

	}

}
