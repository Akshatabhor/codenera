package FileHandling;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) 
	{
		try
		{
			File ob=new File("C:\\Users\\Omkar\\OneDrive\\Desktop\\java\\addtwodigit.java");
			Scanner sc=new Scanner(ob);
			while(sc.hasNextLine())
			{
				System.out.println(sc.next());
			}
		}
		catch(Exception e)
		{
			
		}
	}

}
