package StringBuilder;

import java.util.Scanner;

public class StringAppears {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		str=str.toLowerCase();
		
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			sb.append(str.charAt(i));
			int c=1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					i++;
					c++;
				}
				else
				{
					break;
				}
			}
			sb.append(c);
			
		}
		System.out.println(sb);
	}

}
