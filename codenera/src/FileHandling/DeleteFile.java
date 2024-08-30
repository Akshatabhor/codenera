package FileHandling;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) 
	{
		File ob=new File("D:\\File1.txt");
		
		if(ob.delete())
		{
			System.out.println("File Delete Successfully");
		}
		else
		{
			System.out.println("somthing went wrong");
		}
	}

}
