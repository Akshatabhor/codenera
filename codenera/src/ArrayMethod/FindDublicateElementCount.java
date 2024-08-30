package ArrayMethod;

import java.util.Scanner;

public class FindDublicateElementCount 
{

    public int FindDublicateElementCount(int[] a) 
    {
        int c = 0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j]) 
                {
                    System.out.println(a[i] + " ");
                    c++;
                    break;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Duplicate values in the array:");

        FindDublicateElementCount obj = new FindDublicateElementCount();
        int duplicateCount = obj.FindDublicateElementCount(a);
        System.out.println("Count of duplicate values: " + duplicateCount);

    }
}
