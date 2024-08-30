package Matrix;
import java.util.*;
public class kthSmallestMatrix {

	public static void main(String[] args)
	{
		
				Scanner sc = new Scanner(System.in);
		        System.out.println("Enter Row size");
		        int row = sc.nextInt();
		        System.out.println("Enter Column size");
		        int col = sc.nextInt();

		        int a[][] = new int[row][col];

		        System.out.println("Enter Elements of Matrix");
		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a[i].length; j++) {
		                a[i][j] = sc.nextInt();
		            }
		        }

		        System.out.println("Given Matrix:");
		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a[i].length; j++) {
		                System.out.print(a[i][j] + " ");
		            }
		            System.out.println();
		        }

		        System.out.println("Enter Value of k to find kth smallest element:");
		        int k = sc.nextInt();

		        int n = a.length;
		        int ele[] = new int[n * n];
		        int index = 0;

		        for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a[i].length; j++) {
		                ele[index++] = a[i][j];
		            }
		        }

		        Arrays.sort(ele);
		        
		        System.out.println("The " + k + "th smallest element in the given matrix is: " + ele[k - 1]);

		        
		    }
		
	}


