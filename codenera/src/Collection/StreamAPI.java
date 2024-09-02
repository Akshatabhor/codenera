package Collection;

import java.util.*;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) 
    {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 70, 80);

        Integer secondHighest = numbers.stream()
                                       .distinct()                        
                                       .sorted(Comparator.reverseOrder()) 
                                       .skip(1)                           
                                       .findFirst()                    
                                       .orElseThrow(() -> new NoSuchElementException("List must have at least two distinct numbers"));

        System.out.println("The second highest number is: " + secondHighest);
    }
}
