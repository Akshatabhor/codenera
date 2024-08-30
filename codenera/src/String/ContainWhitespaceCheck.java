package String;

import java.util.Scanner;

public class ContainWhitespaceCheck 
{

		public boolean stringChecker(char ch[])
		{
			boolean b=false;
			for(int i=0; i<ch.length; i++)
			{
				if(Character.isLetterOrDigit(ch[i])==false && Character.isWhitespace(ch[i])==false)
				{
					b=true;
				}
			}
			return b;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String s=sc.nextLine();
			
			char ch[]=s.toCharArray();
			ContainWhitespaceCheck obj = new ContainWhitespaceCheck();
			boolean b=obj.stringChecker(ch);
			if(b==true)
			{
				System.out.println("String is not accepted");
			}
			else
			{
				System.out.println("String is accepted");
			}
		}

}
