package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile1 {

	public static void main(String[] args) throws FileNotFoundException 
	{
		try
		{
			File ob=new File("D:\\File3.txt");
			Scanner sc=new Scanner(ob);
			StringBuffer sb=new StringBuffer();
			while(sc.hasNextLine())
			{
				sb.append(sc.nextLine());
			}
			String str=String.valueOf(sb);
			String s[]=str.split(" ");
			System.out.println("Word Count:"+s.length);
			sc.close();
		}
		catch(Exception e)
		{
			
		}
	}

}
