package ArrayMethod;
import java.util.Scanner;
public class SearchingOfElement 
{
	public void searchElement(int[] a, int ele) 
	{
        int count = 0;
        for (int i = 0; i < a.length; i++) 
        {
            if (a[i] == ele) 
            {
                count++;
            }
        }
        if (count != 0)
        {
            System.out.println(ele + " is present " + count + " times in the array.");
        } else {
            System.out.println(ele + " is not present in the array.");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search:");
        int ele = sc.nextInt();

        SearchingOfElement obj = new SearchingOfElement();
        obj.searchElement(a,ele);

    }
}
