package ArrayMethod;

import java.util.Scanner;

public class DeleteElementfromuser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the element to be deleted: ");
        int elementToDelete = scanner.nextInt();
        
        int[] newArray = deleteElement(array, elementToDelete);
        
        System.out.println("Array after deletion:");
        for (int element : newArray) {
            System.out.print(element + " ");
        }
    }
    
    public static int[] deleteElement(int[] array, int elementToDelete) {
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToDelete) {
                count++;
            }
        }
        
        int[] newArray = new int[array.length - count];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != elementToDelete) {
                newArray[index++] = array[i];
            }
        }
        
        return newArray;
    }
}

