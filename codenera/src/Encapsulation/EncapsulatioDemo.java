package Encapsulation;
class student
{
	private int RollNo;
	private String name;
	//setter method
	public void setRollNo(int RollNo)
	{
		this.RollNo=RollNo;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	//getter method
	public int getRollNo()
	{
		return this.RollNo;
	}
	public String getname()
	{
		return this.name;
	}
}
public class EncapsulatioDemo 
{

	public static void main(String[] args) 
	{
		student obj=new student();
		obj.setRollNo(1);
		obj.setname("Akshata");
		
		System.out.println("Roll no of student:"+obj.getRollNo());
		System.out.println("name  of student:"+obj.getname());

	}

}
