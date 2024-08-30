package FileHandling;

import java.io.File;//ctrl+shift+o when import not called then press this
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) 
	{
		File ob=new File("D:\\File1.txt");
		System.out.println("File Name:"+ob.getName());
		System.out.println("it's mode is it read mode:"+ob.canRead());
		System.out.println("it's mode is it read mode:"+ob.canWrite());

		
		try
		{
			boolean b=ob.createNewFile();
			if(b==true)
			{
				System.out.println("your file created succesfully");
			}
			else
			{
				System.out.println("somthing went wrong");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
