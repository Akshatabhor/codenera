package RevisionPractice;

public class MeargeOfTwoArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {11,12,13,14,15};
		int c[]=new int[a.length+b.length];
		int x=0;
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
		}
		System.out.println("meargeing of two array:");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
	}

}
