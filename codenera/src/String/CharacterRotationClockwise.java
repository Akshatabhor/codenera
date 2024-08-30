package String;

import java.util.Scanner;

public class CharacterRotationClockwise {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter STring");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char s[]=str.toCharArray();	
		
		char t=s[s.length-1];
		for(int i=s.length-1;i>0;i--)
		{
			s[i]=s[i-1];
		}
		s[0]=t;
		System.out.println("Charchter Rotate Clockwise");
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}

	}

}
