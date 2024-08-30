package ArrayMethod;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int maxNumber = findMax(array);

        System.out.println("The maximum number in the array is: " + maxNumber);
    }

    public static int findMax(int[] array) {
        int max = array[0]; 

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}

