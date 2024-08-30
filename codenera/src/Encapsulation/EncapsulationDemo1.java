package Encapsulation;
class student1
{
	private int rollno;
	private String name;
	public student1(int rollno, String name) 
	{
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getRollno() 
	{
		return rollno;
	}
	public String getName()
	{
		return name;
	}
	
	
}
public class EncapsulationDemo1
{

	public static void main(String[] args) 
	{
		student1 obj=new student1(1,"akshata");
		student1 ob1=new student1(2,"gaurav");
		System.out.println("rollno:"+obj.getRollno());
		System.out.println("name:"+obj.getName());
		System.out.println("rollno:"+ob1.getRollno());
		System.out.println("name:"+ob1.getName());


		
	}

}
