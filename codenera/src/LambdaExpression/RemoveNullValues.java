package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveNullValues 
{
    public static void main(String[] args)
    {

    	List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", null, "cherry", null, "date"));

        strings.removeIf(s -> s == null);

        System.out.println("List after removing null values: " + strings);
    }
}
