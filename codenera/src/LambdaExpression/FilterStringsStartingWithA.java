package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringsStartingWithA
{
    public static void main(String[] args) 
    {

    	List<String> strings = new ArrayList<>(Arrays.asList("Apple", "Banana", "Avocado", "Cherry", "Apricot", "Grape"));

        strings.removeIf(s -> !s.startsWith("A"));

        System.out.println("Strings starting with 'A': " + strings);
    }
}
