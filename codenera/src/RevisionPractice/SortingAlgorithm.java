package RevisionPractice;

public class SortingAlgorithm {

	public static void main(String[] args) 
	{
		int a[]={0,1,2,2,1,0};
		
		System.out.println("sorted array:");

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
				}
			}
			System.out.println(a[i]+" ");
		}
	}

}
