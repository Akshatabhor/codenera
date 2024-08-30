package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringsWithSeparator 
{
    public static void main(String[] args) 
    {

    	List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        String result = strings.stream()
                               .collect(Collectors.joining(", ")); // Separator: ", "

        System.out.println("Joined strings: " + result);
    }
}
