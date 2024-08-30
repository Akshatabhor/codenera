package ArrayMethod;

public class maxproductwithnoreturnnoargument 
{
	public void maxproductwithnoreturnnoargument()
	{
		int a[]={2, 3, 5, 7, -7, 5, 8, -5};

		System.out.println("enter the original array:");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		int max=0;
		int index1=0;
		int index2=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
			 	if(a[j]*a[i]>max)
				{
					max=a[j]*a[i];
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println("maximum product:"+max);
		if (index1 != -1 && index2 != -1) 
		{
	            System.out.println("Pair of elements: (" + a[index1] + ", " + a[index2] + ")");
	        }

	}
	public static void main(String[] args) 
	{
		maxproductwithnoreturnnoargument obj=new maxproductwithnoreturnnoargument();
		System.out.println("main method started.....");
		obj.maxproductwithnoreturnnoargument();
		System.out.println("main method completed........");
	}

}
