package Collection;
import java.util.ArrayList;
import java.util.Scanner;
public class UpdatedMethodUsingScanner 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter size of arraylist : ");
		int size = sc.nextInt(); // 5
		ArrayList ob = new ArrayList();
		System.out.println("enter an element in arraylist :  ");
		for(int i = 0;i<size;i++)
		{
			int no = sc.nextInt();
			ob.add(no);
		}
		System.out.println("given Arraylist : "+ob); // arrays.toString
		System.out.println("enter index to update element in given arraylist : ");
		int ind = sc.nextInt(); // 2
		System.out.println("enter element : ");
		int ele = sc.nextInt();
		ob.set(ind, ele);
		System.out.println("given Arraylist after update : "+ob);
		
		
		
	}

}
