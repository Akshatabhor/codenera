package inheritance;
class employee
{
	void work()
	{
		System.out.println("employee are working in TCS.");
	}
	void getsallary()
	{
		System.out.println("the sallary of employee is 45000 per month.");
	}
}
class HrManager extends employee
{
	void work1()
	{
		System.out.println("Hr has take the interview of every employee.");
	}
	void AddEmployee()
	{
		System.out.println("after the interview selection Hr maneger add employee in our company.");
	}
	
}
public class multileveldemo4 {

	public static void main(String[] args) 
	{
		HrManager obj=new HrManager();
		obj.work1();
		obj.AddEmployee();
		obj.getsallary();
		obj.work();
	}

}
