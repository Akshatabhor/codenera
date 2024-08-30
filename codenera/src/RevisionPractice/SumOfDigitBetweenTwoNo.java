package RevisionPractice;

public class SumOfDigitBetweenTwoNo {

    public static void main(String[] args) 
    {
        int sum = 0;
        
        for(int i = 100; i <= 200; i++)
        {
            int no = i; 
            int digitsum = 0;
            
            while(no != 0)
            {
                digitsum = digitsum + no % 10;
                no = no / 10;
            }
            sum = sum + digitsum;
        }
        System.out.println("Sum of digits from 100 to 200: " + sum);
    }
}
