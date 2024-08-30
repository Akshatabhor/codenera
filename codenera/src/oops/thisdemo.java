package oops;

public class thisdemo 
{
	int n;
	public thisdemo(int a)
	{
		this.n=a;
		System.out.println(a);
	}
	public void sq()
	{
		System.out.println(n*n);
	}
	public void cube()
	{
		System.out.println(n*n*n);
	}
	public static void main(String[] args) 
	{
		thisdemo obj= new thisdemo(10);
		obj.sq();
		obj.cube();
	}

}
