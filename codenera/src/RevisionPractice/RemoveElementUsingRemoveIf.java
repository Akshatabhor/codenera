package RevisionPractice;
import java.util.ArrayList;
import java.util.Collections;

public class RemoveElementUsingRemoveIf 
{
    public static void main(String[] args)
    {
    	ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, 3, 4, 3, 5, 3, 6, 3);

        numbers.removeIf(n -> n == 3);

        System.out.println("ArrayList after removing all occurrences of 3: " + numbers);
    }
}
