package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/*Q18. Implement a program to find the most frequently occurring element in a list using streams.
*/
public class StreamAPIFreequency {

	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        
        Optional<Integer> mostFrequent = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey);
        System.out.println(mostFrequent);
	}

}
