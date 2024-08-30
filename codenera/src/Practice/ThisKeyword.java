package Practice;


public class ThisKeyword
{
	
	int id,m1,m2;

	ThisKeyword(int id,int m1,int m2)
	{
		this.id=id;
		this.m1=m1;
		this.m2=m2;
	}
	public void calmarks()
	{
		int total=m1+m2;
		System.out.println( " marks : "+total);
	}
	public static void main(String[] args) 
	{
		ThisKeyword obj=new ThisKeyword(1,20,20);
		obj.calmarks();
	}
	
}
