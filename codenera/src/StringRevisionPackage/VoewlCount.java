package StringRevisionPackage;

import java.util.Scanner;

public class VoewlCount {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		int cnt=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||  str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
			{
				cnt++;
			}
		}
		System.out.println("count of voewl:"+cnt);

	}

}
