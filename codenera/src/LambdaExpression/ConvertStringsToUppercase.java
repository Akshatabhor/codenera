package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringsToUppercase
{
    public static void main(String[] args) 
    {
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "pear", "grape", "kiwi"));

        strings.replaceAll(s -> s.toUpperCase());

        System.out.println("Strings converted to uppercase: " + strings);
    }
}
