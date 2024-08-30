package String;
import java.util.Scanner;
public class LexicographySmallestLargest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        sc.nextLine();  

        if (n <= 0)
        {
            System.out.println("No string provided");
            return; 
        }
        String[] s1 = new String[n];
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++)
        {
            s1[i] = sc.nextLine();
        }

        String small = s1[0];
        String large = s1[0];

        for (int i = 1; i < n; i++) 
        {
            if (s1[i].compareTo(small) < 0)
            {
                small = s1[i];
            }
            if (s1[i].compareTo(large) > 0)
            {
                large = s1[i];
            }
        }

        System.out.println("Smallest String:"+small);
        System.out.println("largest String:"+large);

    }
}
