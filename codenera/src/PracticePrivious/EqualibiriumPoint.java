package PracticePrivious;

public class EqualibiriumPoint 
{
	public void EqualibiriumPoint()
	{
		int a[]={1,3,5,2,2};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();

		for(int i=0;i<a.length;i++)
		{
			int lsum=0,rsum=0;
			for(int j=0;j<i;j++)
			{
				lsum=lsum+a[j];
			}
			for(int k=i+1;k<a.length;k++)
			{
				rsum=rsum+a[k];
			}
			if(lsum==rsum)
			{
				System.out.println("equilibrium point:"+(i+1));
			}
		}

	}

	public static void main(String[] args)
	{
		EqualibiriumPoint obj=new EqualibiriumPoint();
		obj.EqualibiriumPoint();
		
	}

}
