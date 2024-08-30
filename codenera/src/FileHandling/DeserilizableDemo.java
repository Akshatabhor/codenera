package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class DeserilizableDemo 
{

	public static void main(String[] args) 
	{
		String str="D:\\Encrept.txt";
		try
		{
			FileInputStream ob=new FileInputStream(str);
			ObjectInputStream ob1=new ObjectInputStream(ob);
			
			SerializationDemo e1=(SerializationDemo) ob1.readObject();
			SerializationDemo e2=(SerializationDemo) ob1.readObject();
			
			System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getSal()+" "+e1.getPwd());
			System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getSal()+" "+e2.getPwd());

			ob.close();
			ob1.close();
			System.out.println("Read Successfully");
		}
		catch(Exception e)
		{
			
		}
	}

}
