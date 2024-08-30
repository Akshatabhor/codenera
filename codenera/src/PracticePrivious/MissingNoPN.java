package PracticePrivious;

public class MissingNoPN 
{
	public void MissingNoPN()
	{
		int a[]={2,3,7,6,8,-1,10,15};
		int range=0;
		int c=0;

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					range=a[i];
				}
				else
				{
					range=a[j];
				}
			}
		}
		System.out.println("missing element:");
		for(int i=1;i<range;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(i==a[j])
				{
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println(i);
			}
		}

	}
	public static void main(String[] args) 
	{
		MissingNoPN obj=new MissingNoPN();
		obj.MissingNoPN();
	}

}
