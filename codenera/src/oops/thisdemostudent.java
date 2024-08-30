package oops;

public class thisdemostudent 
{
	int id,m1,m2;
	thisdemostudent (int id,int m1,int m2)
	{
		this.id=id;
		this.m1=m1;
		this.m2=m2;
	}
	public void caltotalmarks()
	{
		int total=m1+m2;
		System.out.println(id+"marks:"+total);
	}

	public static void main(String[] args) 
	{
		thisdemostudent obj=new thisdemostudent(1,78,90);
		thisdemostudent obj1=new thisdemostudent(2,80,90);
		obj.caltotalmarks();
		obj1.caltotalmarks();
	}

}
