package ArrayMethod;

public class FindDuplicateFirstlastOcuurance 
{
	 public static void findFirstAndLast(int arr[], int x)
		    {
		        int n = arr.length;
		        int first = -1, last = -1;
		        for (int i = 0; i < n; i++) 
		        {
		            if (x != arr[i])
		                continue;
		            if (first == -1)
		                first = i;
		            last = i;
		        }
		        if (first != -1)
		        {
		            System.out.println("First Occurrence index = " + first);
		            System.out.println("Last Occurrence index = " + last);
		        }
		        else
		        {
		            System.out.println("Not Found");
		        }
		    }

		
		public static void main(String[] args) 
		{
			int N = 9;
			int v[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
			int X = 5;
			findFirstAndLast(v,X);

		}

}

	


