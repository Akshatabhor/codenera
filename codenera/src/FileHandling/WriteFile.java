package FileHandling;

import java.io.FileWriter;

public class WriteFile {

	public static void main(String[] args) 
	{
		try
		{
			FileWriter ob=new FileWriter("D:\\File3.txt");
			ob.write("Hello Java");
			ob.close();
			System.out.println("Content Write Succesfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
