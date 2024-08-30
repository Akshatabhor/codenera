package PracticePrivious;

public class ArrayProductElement 
{
	public void ArrayProductElement()
	{
		int a[]={1,2,3,4,5,6,7};
		System.out.println("original array:");

		int multi=1;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			multi=multi*a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			a[i]=multi/a[i];
		}
		System.out.println("\nproduct array:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}
	public static void main(String[] args)
	{
		ArrayProductElement obj=new ArrayProductElement();
		obj.ArrayProductElement();
	}

}
