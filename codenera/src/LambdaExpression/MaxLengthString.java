package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MaxLengthString
{
    public static void main(String[] args) 
    {

    	List<String> strings = Arrays.asList("apple", "banana", "grapefruit", "pear", "kiwi");

        String maxLengthString = strings.stream().max(Comparator.comparingInt(String::length)).orElse(null);
                                    



        System.out.println("String with the maximum length: " + maxLengthString);
    }
}
