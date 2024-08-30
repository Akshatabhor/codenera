package ArrayMethod;

public class MeargeTwoArrayWithReturn 
{
	public static int[] mergeArray(int a[],int b[])
	{
		int len1=a.length;
		int len2=b.length;
		int []mergeArray=new int[len1+len2];
		for(int i=0;i<len1;i++)
		{
			mergeArray[i]=a[i];
		}
		for(int i=0;i<len2;i++)
		{
			mergeArray[len1+i]=b[i];
		}
		return mergeArray;
		
	}
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int b[]= {6,7,8,9,10};
		
		int [] mergeArray=mergeArray(a,b);
		System.out.println("merge Array:");
		for(int i=1;i<=mergeArray.length;i++)
		{
			System.out.println(i+" ");
		}
	}

}
