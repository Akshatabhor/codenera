package LambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringsByLastCharacter 
{
    public static void main(String[] args) 
    {

    	List<String> strings = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));

        strings.sort(Comparator.comparingInt(s -> s.charAt(s.length() - 1)));

        System.out.println("Strings sorted by last character: " + strings);
    }
}
