package StaticKeyword;
class student
{
	int id;
	String Name;
	static String classname="codenera";
	
		public student(int id, String Name)
		{
			this.id=id;
			this.Name=Name;
			}
	
	
}
public class StaticDemo 
{

	public static void main(String[] args)
	{
		student obj=new student(1,"Akshata");
		student obj1=new student(2,"Ashwini");
		student obj2=new student(3,"Nisha");
		
		System.out.println(obj.id+" "+obj.Name+" "+obj.classname);
		System.out.println(obj1.id+" "+obj1.Name+" "+obj1.classname);
		System.out.println(obj2.id+" "+obj2.Name+" "+obj2.classname);



	}

}
