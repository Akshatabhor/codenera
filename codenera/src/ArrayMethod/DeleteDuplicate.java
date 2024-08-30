package ArrayMethod;

import java.util.Scanner;

public class DeleteDuplicate 
{
	public void DeleteDuplicate()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i =0;i<a.length;i++)
		{
			for(int j =i+1; j<a.length;j++)	
			{
				if(a[i] == a[j])
				{
					a[j] = -1;
				}
			}
		}	
		int c =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] != -1)
			{
				System.out.print(a[i]+"  ");
				c++;
			}
		}
		System.out.println("The new length of array:"+c);

	}
	public static void main(String[] args)
	{
		DeleteDuplicate obj=new DeleteDuplicate();
		obj.DeleteDuplicate();
	}

}
