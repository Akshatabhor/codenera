package LambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringsWithLengthEqualToThree 
{
    public static void main(String[] args) 
    {

    	List<String> strings = Arrays.asList("cat", "dog", "fish", "apple", "bat", "car");

        List<String> lengthThreeStrings = strings.stream()
                                                 .filter(s -> s.length() == 3)
                                                 .collect(Collectors.toList());


        System.out.println("Strings with length equal to 3: " + lengthThreeStrings);
    }
}
