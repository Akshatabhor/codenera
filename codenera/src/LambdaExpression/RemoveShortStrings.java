package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveShortStrings 
{
    public static void main(String[] args)
    {

    	List<String> strings = new ArrayList<>(Arrays.asList("apple", "cat", "banana", "dog", "pear", "kiwi"));

        strings.removeIf(s -> s.length() < 5);

        System.out.println("Strings with length 5 or more: " + strings);
    }
}

