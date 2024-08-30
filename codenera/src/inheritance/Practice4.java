package inheritance;
class employee5
{
	void work()
	{
		System.out.println("employee are work in tcs");
	}
	void getsallary()
	{
		System.out.println("employee sallary is 35000");
		
	}
}
class HRManger extends employee
{
	void work()
	{
		System.out.println("employee manager assign to work daily of every person");
	}
	void addemployee()
	{
		System.out.println("hr take a interview of every person after that add to employe in our company ");
	}
}

public class Practice4 {

	public static void main(String[] args) 
	{
		HRManger obj=new HRManger();
		obj.work();
		obj.getsallary();
		obj.work();
		obj.addemployee();
	}

}
