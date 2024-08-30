package Polymorphism;
class employee
{
	int salary=45000;
	int bonous=2000;
	int total=salary+bonous;
	void calculatesalary()
	{
		System.out.println("employee salary:");
		System.out.println(total);
	}
}
class manager
{
	int salary=40000;
	int bonous=2000;
	int totalmanager=salary+bonous;
	void calculatesalary()
	{
		System.out.println("manager salary:");
		System.out.println(totalmanager);
	}
}
class programmer
{
	int salary=35000;
	int bonous=2000;
	int totalprogramer=salary+bonous;
	void calculatesalary()
	{
		System.out.println("programmer salary:");
		System.out.println(totalprogramer);
	}
}

public class example4 {

	public static void main(String[] args) 
	{
		employee obj1=new employee();
		obj1.calculatesalary();
		manager obj2=new manager();
		obj2.calculatesalary();
		programmer obj3=new programmer();
		obj3.calculatesalary();
	}

}
