package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertIntegersToDoubles
{
    public static void main(String[] args)
    {
    	
    	List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Double> doubles = new ArrayList<>();
        integers.forEach(i -> doubles.add((double) i));

        System.out.println("Converted doubles: " + doubles);
    }
}
