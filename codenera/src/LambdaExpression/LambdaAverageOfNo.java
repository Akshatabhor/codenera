/*Use a lambda function to find the average of a list of numbers.
*/
package LambdaExpression;
import java.util.Scanner;
interface demo13
{
	public void disp();
}
public class LambdaAverageOfNo 
{

	public static void main(String[] args) 
	{
		demo13 ob=()->{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the size of array:");
			int size = sc.nextInt();
			
			int a[]=new int[size];

			System.out.println("enter the element of array:");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
				double avg= (double)sum/a.length;


			System.out.println("enter the average:"+avg);
			

		};
		ob.disp();
	}

}
/*

	public static void main(String[] args) {
		
		getAverage ob = (int arr[]) -> {
			
			int avg=0;
			int sum=0;
			for(int i=0; i<arr.length; i++)
			{
				sum=sum+arr[i];
			}
			
			avg=sum/arr.length;
			
			return avg;
			
		};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		int arr[]=new int [size];
		
		System.out.println("Enter elements : ");
		for(int i=0; i<size; i++)
		{
			 arr[i] = sc.nextInt();
		}
		
		int c = ob.avg(arr);
		
		System.out.println("Average : "+c);

	}

}*/
