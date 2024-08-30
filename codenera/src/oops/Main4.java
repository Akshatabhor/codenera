package oops;

class Employee
{
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary)
    {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary()
    {
        return baseSalary;
    }

    public void displayDetails() 
    {
        System.out.println("Name : " + name);
        System.out.println("Base Salary : " + baseSalary);
        System.out.println("Total Salary : " + calculateSalary());
    }
}

class Manager extends Employee
{
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) 
    {
        super(name, baseSalary); 
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() 
    {
        return baseSalary + bonus;
    }

    @Override
    public void displayDetails()
    {
        super.displayDetails();
        System.out.println("Bonus : " + bonus);
    }
}
public class Main4 
{

	public static void main(String[] args) 
	{
		Employee employee = new Employee("Akshata", 50000);
        employee.displayDetails();

        System.out.println();

        Manager manager = new Manager("Gaurav", 70000, 15000);
        manager.displayDetails();

	}

}