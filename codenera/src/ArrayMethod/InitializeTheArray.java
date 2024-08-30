package ArrayMethod;

public class InitializeTheArray 
{
	public void InitializeTheArray()
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.println("enter the element:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("method started....");
		InitializeTheArray obj=new InitializeTheArray();
		obj.InitializeTheArray();
		System.out.println("method ended....");
	}

}
