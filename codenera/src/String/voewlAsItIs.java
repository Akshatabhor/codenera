package String;

import java.util.Scanner;

public class voewlAsItIs {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter STring");
		String str=sc.nextLine();
		str=str.toUpperCase();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == ' ')
			{
			System.out.print(ch);
			}	
			
		
	}

	}

}
