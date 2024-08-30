package inheritance;

class emp
{
	int salary=30000;
}

public class programmer extends emp

{
    int bonous=5000;
    
	public static void main(String[] args) 
	{
		programmer obj=new programmer();
		System.out.println(obj.bonous);
		System.out.println(obj.salary);
		System.out.println(obj.salary+obj.bonous);
	}

}
