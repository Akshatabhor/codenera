package Pattern;

public class NumberPattern17 {

    public static void main(String[] args) 
    {
    

        for (int i = 0; i < 5; i++) 
        {
            for (int k = 0; k < i; k++) 
            {
                System.out.print(" ");
            }
            for (int j = i + 1; j <= 5; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for (int i = 5 - 2; i >= 0; i--)
        {
            for (int k = 0; k < i; k++) 
            {
                System.out.print(" ");
            }
            for (int j = i + 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
