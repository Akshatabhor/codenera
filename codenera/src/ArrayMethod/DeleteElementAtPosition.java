package ArrayMethod;

import java.util.Scanner;

public class DeleteElementAtPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the position of the element to be deleted (0-based index): ");
        int position = scanner.nextInt();
        
        if (position < 0 || position >= size) {
            System.out.println("Invalid position! Please enter a valid position.");
        } else {
            int[] newArray = deleteElementAtPosition(array, position);
            
            System.out.println("Array after deletion:");
            for (int element : newArray) {
                System.out.print(element + " ");
            }
        }
    }
    
    public static int[] deleteElementAtPosition(int[] array, int position) {
        int[] newArray = new int[array.length - 1];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i != position) {
                newArray[index++] = array[i];
            }
        }
        
        return newArray;
    }
}
