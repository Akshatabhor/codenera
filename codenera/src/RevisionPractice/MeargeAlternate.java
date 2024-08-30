package RevisionPractice;

public class MeargeAlternate {

	public static void main(String[] args)
	{
		int a[]= {10,20,30,40,50};
		int b[]= {1,2,3,4,5};
		int c[]=new int[a.length+b.length];
		
		int i=0;
		int j=0;
		int k=b.length-1;//0
		
		for( i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				c[i]=a[j];
				j++;
			}
			else
			{
				c[i]=b[k];
				k--;//k++
			}
		}
		System.out.println("alternate mearging");
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
		
	}

}
