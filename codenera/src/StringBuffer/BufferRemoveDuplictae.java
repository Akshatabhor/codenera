package StringBuffer;

import java.util.Scanner;

public class BufferRemoveDuplictae {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		StringBuffer sb=new StringBuffer(sc.nextLine());
		System.out.println("string:"+sb);
		for(int i=0;i<sb.length();i++)
		{
			for(int j=i+1;j<sb.length();j++)
			{
				if(sb.charAt(i)==sb.charAt(j))
				{
					sb.deleteCharAt(j);
					j--;
				}
			}
		
		}
		System.out.println(sb);
		
		
	}

}
