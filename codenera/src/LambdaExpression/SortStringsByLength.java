package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortStringsByLength {
    public static void main(String[] args) 
    {
        List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "pear", "grape", "kiwi"));

        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        System.out.println("Strings sorted by length: " + strings);
    }
}
