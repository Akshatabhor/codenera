/*Write a Java program to create a class called Employee 
with private instance variables employee_id, employee_name,
and employee_salary. Provide public getter and setter methods to access and modify the 
id and name variables, but provide a getter method for the salary variable that 
returns a formatted string.*/

package Encapsulation;
class employee
{
	private int employee_id;
	private String employee_name;
	private int employee_salary;
	public void setemployee_id(int employee_id)
	{
		this.employee_id=employee_id;
	}
	public void setemployee_name(String employee_name)
	{
		this.employee_name=employee_name;
	}
	public void setemployee_salary(int employee_salary)
	{
		this.employee_salary=employee_salary;
	}
	public int getEmployee_id() 
	{
		return employee_id;
	}
	public String getEmployee_name()
	{
		return employee_name;
	}
	public int getEmployee_salary() 
	{
		return employee_salary;
	}
	
}
public class Wxample4 {

	public static void main(String[] args) 
	{
		employee obj=new employee();
		obj.setemployee_id(1);
		obj.setemployee_name("Akshata");
		obj.setemployee_salary(45000);
		
		System.out.println("id of the employee:"+obj.getEmployee_id());
		System.out.println("name of the employee:"+obj.getEmployee_name());
		System.out.println("salary of the employee"+obj.getEmployee_salary());
	}

}
