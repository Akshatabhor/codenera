package String;

import java.util.Scanner;

public class EvenIndexCharwithspecialSym {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		System.out.println("even position character:");
		for(int i = 1;i < c.length;i=i+2)
		{
			c[i]='#';
		}
		String modifiedstr=new String(c);
		System.out.println("modified string  even character index with #:");
		System.out.println(modifiedstr);
	}

}
