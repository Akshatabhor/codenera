/*Write a Java program to create an abstract class 
 * Employee with abstract methods calculateSalary() and displayInfo(). 
 * Create subclasses Manager and Programmer that extend the Employee class
 *  and implement the respective methods to calculate salary 
 *  and display information for each role.

*/
package Abstraction;
abstract class employee
{
	int id;
	String name;
	double basesalary;
	employee(int id, String name, double basesalary)
	{
		this.id=id;
		this.name=name;
		this.basesalary=basesalary;
	}
	abstract double calculatesalary();
	abstract void displyinfo();
}
class manager extends employee
{
	double bonous;
	manager(int id, String name,double basesalary,double bonous)
	{
		super(id, name, basesalary);
		this.bonous=bonous;
	}
	double calculatesalary()
	{
		return bonous+basesalary;
	}
	void displyinfo()
	{
		System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("Base Salary: " + basesalary);
        System.out.println("Bonus: " + bonous);
        System.out.println("Total Salary: " + calculatesalary());
	}
}
class programmer extends employee
{
	double overtime;
	programmer(int id ,String name ,double basesalary,double overtime)
	{
		super(id, name, basesalary);
		this.overtime=overtime;
	}
	double calculatesalary()
	{
		return overtime+basesalary;
	}
	void displyinfo()
	{
		System.out.println("Manager Name: " + name);
        System.out.println("Manager ID: " + id);
        System.out.println("overtime Salary: " + overtime);
        System.out.println("overtime: " + overtime);
        System.out.println("Total Salary: " + calculatesalary());
	}

}
public class Example5 {

	public static void main(String[] args)
	{
		programmer obj = new programmer(1, "Akshata", 45000, 2000);
        obj.displyinfo();
        manager obj1= new manager(2, "komal", 45000, 2000);
        obj1.displyinfo();
		
	}

}
