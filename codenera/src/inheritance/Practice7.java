package inheritance;
class person5
{
	int id;
	String firstname;
	 String lastname;
	public person5(int id,String firstname , String lastname)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
	}
	void getfirstname()
	{
		System.out.println(firstname);
	}
	void getlastname()
	{
		System.out.println(lastname);
	}
}
class employee8 extends person5
{
	String JobTitle;
	public employee8(int id,String firstname, String lastname,String JobTitle)
	{
		super(id, firstname, lastname);
		this.JobTitle=JobTitle;
	}
	void getemployeeId()
	{
		System.out.println(id);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(JobTitle);

		
	}
	void getlastname()
	{
		super.getlastname();
	}
}
public class Practice7 {

	public static void main(String[] args) 
	{
		employee8 obj=new employee8(1 ,"Akshata", "Bhor","Developer");
		obj.getemployeeId();
	}

}
