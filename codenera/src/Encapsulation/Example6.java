/*Write a Java program to create a class called Car with private instance 
 * variables company_name, model_name, year, and mileage. Provide public getter 
 * and setter methods to access and modify the company_name, model_name, 
 * and year variables. However, only provide a getter method for the mileage variable.
 */


package Encapsulation;
class car
{
	private String company_name;
	private String model_name;
	private int year;
	private int mileage;
	public void setCompany_name(String company_name) 
	{
		this.company_name = company_name;
	}
	public void setModel_name(String model_name) 
	{
		this.model_name = model_name;
	}
	public void setYear(int year) 
	{
		this.year = year;
	}
	public String getCompany_name() 
	{
		return company_name;
	}
	public String getModel_name() 
	{
		return model_name;
	}
	public int getYear() 
	{
		return year;
	}
	public int getMileage() 
	{
		return mileage;
	}
	public void setMileage(int mileage)
	{
		this.mileage = mileage;
	}
	
	
	
}
public class Example6 {

	public static void main(String[] args) 
	{
		car obj=new car();
		obj.setCompany_name("abc");
		obj.setModel_name("X");
		obj.setYear(2024);
		obj.setMileage(10);
		System.out.println("name of company:"+obj.getCompany_name());
		System.out.println("name of model:"+obj.getModel_name());
		System.out.println("current year:"+obj.getYear());
		System.out.println("mileage of car:"+obj.getMileage());
	}

}
