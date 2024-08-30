package oops;

public class thisdemomethod 
{
	public thisdemomethod()
	{
		this.even();
		this.odd();
	}
	public void even()
	{
		
		System.out.println("even number:");
		for(int i=2;i<50;i=i+2)
		{
			System.out.println(i);
		}
	}
	public void odd()
	{
		System.out.println("odd numbers:");
		for(int i=1;i<50;i=i+2)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		thisdemomethod obj=new thisdemomethod();
		
	}

}
