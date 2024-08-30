package oops;

public class methoddemo2 
{
	public void add(int a,int b)//no return type with argument
	{
		int c=a+b;
		System.out.println("addition of two no:"+c);
	}

	public static void main(String[] args) {
		methoddemo2 obj=new methoddemo2();
		obj.add(10,20);
		int n1=50,n2=50;
		obj.add(n1,n2);
		
	}

}
