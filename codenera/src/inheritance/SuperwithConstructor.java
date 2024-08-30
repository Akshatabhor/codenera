package inheritance;
class person
{
	int id;
	String name;
	public person(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
}
class employe5 extends person
{
	double salary;
	public employe5(int id,String name,double salary)
	{
		super(id,name);
		this.salary=salary;
	}
	public void disp()
	{
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);

	}
	
	
}
public class SuperwithConstructor 
{

	public static void main(String[] args)
	{
		employe5 obj=new employe5(1,"Akshata",35000);
		obj.disp();
	}

}
