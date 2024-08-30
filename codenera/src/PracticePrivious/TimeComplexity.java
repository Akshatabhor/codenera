package PracticePrivious;
import java.util.Scanner;
public class TimeComplexity 
{
    public static void main(String[] args) 
    {
        int[] a={1, 1, 2, 2, 2, 2, 3,};
        System.out.println("Enter the element you want to count:");
        Scanner s=new Scanner( System.in);
        int n=s.nextInt();
        System.out.println("The element occurs "+ occurrence(a,n)+" times");
    }
    public  static  int occurrence(int[] a, int n)
    {
        int count=0;
        for (int i = 0; i<a.length; i++)
        {
            if(a[i]==n)
            {
                count++;
            }
            
        }
		return count;
        
     }
}