package oops;

public class primewitharrayargument 
{
	public void findprimearr(int a[])//formal argument
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			c=0;
			for(int j=2;j<a[i];j++)
			{
				if(a[i]%j==0)
				{
					c++;
					break;
				}
			}
			if(c==0 && a[i]!=1)
			{
				System.out.println(a[i]);
			}
					
		}
		
	}
	public static void main(String[] args)
	{
		
		int a[]= {1,12,13,17,19,23,22,16};
		
		primewitharrayargument obj = new primewitharrayargument();
		obj.findprimearr(a);//actual argument
	}

}
