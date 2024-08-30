package ArrayMethod;

public class RmoveMaxsumPallindromeElement 
{
	public static void main(String[] args) {
        int[] arr = {11, 121, 33, 909};
        int maxSum = 0;
        int maxSumPalindrome = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                int sum = sumOfDigits(arr[i]);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumPalindrome = arr[i];
                }
            }
        }
        arr = removeElement(arr, maxSumPalindrome);
        System.out.println("Max sum palindrome element: " + maxSumPalindrome);
        //System.out.println("Array after removal: ");
      //  for (int i = 0; i < arr.length; i++) {
            //System.out.print(arr[i] + " ");
       // }
    }

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int original = num;
        while (num != 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return original == reversed;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int remainder = num % 10;
            sum += remainder;
            num /= 10;
        }
        return sum;
    }

    public static int[] removeElement(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                newArr[index++] = arr[i];
            }
        }
        return newArr;
    }

}
