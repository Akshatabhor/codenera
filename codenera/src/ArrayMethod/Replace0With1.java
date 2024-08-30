package ArrayMethod;

import java.util.Scanner;

public class Replace0With1 {
    public int[] replace0With1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Replace0With1 obj = new Replace0With1();
        int result[]=obj.replace0With1();

        System.out.println("Replaced 0 with 1:");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
