package RevisionPractice;

public class MaxProduct {

	public static void main(String[] args)
	{
		int a[]={2, 3, 5, 7, -7, 5, 8, -5};
		System.out.println("Element are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int max=0;
		int index1=0;
		int index2=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=a.length-1;j>i;j--)
			{
				if(a[i]*a[j]>max)
				{
					max=a[i]*a[j];
					index1=i;
					index2=j;
				}
			}
		}
		System.out.println("max product:"+max);
		System.out.println("pair element:(" +a[index1]+","+a[index2]+")" );
		

		

		
			
	}

}
