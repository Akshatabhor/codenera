package Matrix;
import java.util.Arrays;

public class MedianSortedMatrix
{
    public static void main(String[] args) 
    {
        int[][] matrix = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("The Median of matrix is :"+median(matrix));
    }

    public static int median(int[][] mat)
    {
        int[] arr = new int[mat.length * mat[0].length];
        int count = 0;
        for (int i = 0; i < mat.length; i++) 
        {
            for (int j = 0; j < mat[i].length; j++) 
            {
                arr[count++] = mat[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[arr.length / 2];
    }
}
