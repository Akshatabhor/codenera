package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class CountWordsGreaterThanThree
{
    public static void main(String[] args)
    {

    	List<String> words = Arrays.asList("apple", "cat", "banana", "dog", "pear", "kiwi");

        long count = words.stream()
                          .filter(word -> word.length() > 3)
                          .count();

        System.out.println("Number of words with length greater than 3: " + count);
    }
}
