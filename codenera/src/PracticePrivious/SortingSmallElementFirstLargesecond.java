package PracticePrivious;
import java.util.*;
public class SortingSmallElementFirstLargesecond 
{
	public void SortingSmallElementFirstLargesecond()
	{
		int a[] = {1, 5, 6, 7, 8, 10};
        int b[] = {2, 4, 9};
	 mergeAndSortArrays(a, b);

        System.out.println("Sorted arrays:");
        System.out.println("Array A :" + Arrays.toString(a));
        System.out.println("Array B :" + Arrays.toString(b));
    }

    public static void mergeAndSortArrays(int[] a, int[] b) 
	{
        int[] c = new int[a.length + b.length];

        int x = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            x++;
        }
        for (int i = 0; i < b.length; i++) {
            c[x] = b[i];
            x++;
        }

        Arrays.sort(c);

        x = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = c[i];
            x++;
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = c[x];
            x++;
        }
    }

	
	public static void main(String[] args) 
	{
		SortingSmallElementFirstLargesecond obj=new SortingSmallElementFirstLargesecond();
		obj.SortingSmallElementFirstLargesecond();
		
	}

}
