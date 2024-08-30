package ArrayMethod;

public class MeargeSecondinReverse 
{
	public void MeargeSecondinReverse()
	{
		 int a[] = {10,20,30,40,50};
	        int b[] = {1,2,3,4,5};

	        int c[] = new int[a.length + b.length];

	        int i = 0, j = 0, k = b.length-1;
		for(i=0;i<c.length;i++)
		{
		if(i%2==0)
		{
			c[i]=a[j];
			j++;
		}
		else
		{
			c[i]=b[k];
			k--;
		}
		}
		for(i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}


	}

	public static void main(String[] args) 
	{
		MeargeSecondinReverse obj=new MeargeSecondinReverse();
		obj.MeargeSecondinReverse();
	}

}
