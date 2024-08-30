package PracticePrivious;

import java.util.Arrays;

public class EvenNoaddPrivoiousOdd {

	public static void main(String[] args) 
	{
		int a[]= {3,2,4,6,8,1,5};
		for (int i = 0; i < a.length; i++) 
		{    
			//a[i]
			if(a[i]%2==1)
			{
				for (int j = i+1; j < a.length; j++) 
				{
					if(a[j]%2==0)
					{
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
				
			}
			
		}
		System.out.println(Arrays.toString(a));


	}

}
