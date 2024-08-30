package ArrayMethod;

public class RemoveSecondpallindromicElement 
{
	public static void main(String[] args) {
        int[] arr = {11, 30, 33, 12, 121};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                count++;
                if (count == 2) {
                    arr = removeElement(arr, i);
                    break;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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

    public static int[] removeElement(int[] arr, int index) {
        int[] newArr = new int[arr.length - 1];
        System.arraycopy(arr, 0, newArr, 0, index);
        System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);
        return newArr;
    }

}
