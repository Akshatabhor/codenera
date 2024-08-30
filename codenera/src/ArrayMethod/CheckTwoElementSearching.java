package ArrayMethod;
import java.util.Scanner;
public class CheckTwoElementSearching 
	{
    public boolean containsElements(int[] a, int ele1, int ele2) 
    {
        boolean foundEle1 = false;
        boolean foundEle2 = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele1) {
                foundEle1 = true;
            }
            if (a[i] == ele2) {
                foundEle2 = true;
            }
        }

        return foundEle1 && foundEle2;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the first element you want to check:");
        int ele1 = sc.nextInt();
        System.out.println("Enter the second element you want to check:");
        int ele2 = sc.nextInt();

        CheckTwoElementSearching obj = new CheckTwoElementSearching();
        boolean result = obj.containsElements(a, ele1, ele2);

        if (result) {
            System.out.println("The array contains both " + ele1 + " and " + ele2 + ".");
        } else {
            System.out.println("The array does not contain both " + ele1 + " and " + ele2 + ".");
        }

    }
}
