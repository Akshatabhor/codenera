package ArrayMethod;

import java.util.Scanner;

public class RepetingElement
{
	public void RepetingElement()
	{
		int a[]={10,5,3,4,3,5,6};

		int count=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					temp=a[i];
					count++;
					break;
				}
			}
			if(count>0)
			{
				break;
			}
		}
		System.out.println("repeting element is:"+temp);

	}

	public static void main(String[] args)
	{
		RepetingElement obj=new RepetingElement();
		obj.RepetingElement();
	}

}
