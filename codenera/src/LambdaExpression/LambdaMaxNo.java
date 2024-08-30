package LambdaExpression;
import java.util.ArrayList;
import java.util.Scanner;

@FunctionalInterface
interface MaxNumber{
	public int max(int arr[]);
}
public class LambdaMaxNo {

	public static void main(String[] args) {
		
		MaxNumber ob = (int arr[]) -> {
			
			int max=0; 
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
			return max;
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
		
		System.out.println("Given list : ");
		for(int i=0; i<size; i++)
		{
			 System.out.println(arr[i]);
		}
		
		int c= ob.max(arr);
		System.out.println("Maximum No : "+c);

	}

}