package StringBuffer;

import java.util.Scanner;

public class BufferIndexOf {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		StringBuffer sb=new StringBuffer(sc.nextLine());
		System.out.println("String:"+sb);
		System.out.println("index of:"+sb.indexOf("java"));
		System.out.println("last index of:"+sb.lastIndexOf("java"));
	}

}
