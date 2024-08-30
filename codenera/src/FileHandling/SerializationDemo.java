package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo  implements Serializable
{
	
	private int id;
	private String name;
	private int sal;
	transient private String pwd;
	
	public SerializationDemo(int id, String name, int sal, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.pwd = pwd;
	}
	

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getSal() {
		return sal;
	}


	public String getPwd() {
		return pwd;
	}


	public static void main(String[] args) 
	{
		SerializationDemo obj=new SerializationDemo(101,"Akshata",40000,"123");
		SerializationDemo obj2=new SerializationDemo(102,"Nisha",50000,"456");
		
		File fobj=new File("D:\\Encrept.txt");
		
		try
		{
			FileOutputStream ob=new FileOutputStream(fobj);
			ObjectOutputStream ob2=new ObjectOutputStream(ob);
			ob2.writeObject(obj);
			ob2.writeObject(obj2);
			
			ob.close();
			ob.close();
			System.out.println("Write Successfully");
		}
		catch(Exception e)
		{
			
		}
	}

}
