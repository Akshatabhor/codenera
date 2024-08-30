package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*-Q13. Write a program to remove null values from a list using streams.
* -Q15. Write a program to find the second smallest element in a list using streams.
-Q16. Implement a program to partition a list into even and odd numbers using streams.
-Q17. Write a program to group elements of a list by their lengths using streams.
-Q18. Implement a program to find the most frequently occurring element in a list using streams.
-Q19. Write a program to convert a list of integers to a comma-separated string using streams.
-Q20. Implement a program to find the longest string in a list using streams.
-Q21. Write a program to remove duplicate elements from a list using streams.
-Q22. Implement a program to find the intersection of two lists using streams.
-Q23. Write a program to create a stream of numbers from 1 to 100 and find the sum of squares of all even numbers.
-Q24. Implement a program to find the cumulative sum of elements in a list using streams.
-Q25. Write a program to convert a list of strings to a map where the key is the length of the string and the value is a list of strings of that length using streams.*/
public class StreamAPI3 {

	public static void main(String[] args) 
	{
		  List<String> ls1= Arrays.asList("java","wawa",null,null,"banana");
	        System.out.println("List :"+ls1);
	        System.out.println("Without null :"+ls1.stream().filter(i->i!=null).toList());
	        
	     List<Integer> ls2=Arrays.asList(1,2,3,4,5,6,7,2,3,2);
	     System.out.println("Elements:"+ls2);
	     
	     System.out.println("Second Smallest:"+ls2.stream().sorted().skip(1).findFirst());
	     System.out.println("Second Largest:"+ls2.stream().sorted((a,b)->(b.compareTo(a))).skip(1).findFirst().get());
	     
	    System.out.println("Even no:"+ls2.stream().filter(i->i%2==0).toList());
	    System.out.println("Odd no:"+ls2.stream().filter(i->i%2==1).toList());
	    
	   int sumofSquare=IntStream.rangeClosed(1, 100).filter(i->i%2==0).map(i->i*i).sum();
	   System.out.println("Sum of square:"+sumofSquare);
	   
	   List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
       List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9);

       list1.retainAll(list2);

       System.out.println("Intersection: " + list1);
       System.out.println("Remove Duplicate:"+ls2.stream().distinct().toList());
       List<String> ls3= Arrays.asList("java","wawa","banana","mango");
       System.out.println("List :"+ls1);
       System.out.println("Find Longest String:"+ls3.stream().max((s1, s2) -> Integer.compare(s1.length(), s2.length())) );
       
       List<Integer> ls4=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	     System.out.println("Elements:"+ls4);
	     System.out.println("comma Sepreted:"+ls4.stream().map(String::valueOf).collect(Collectors.joining(",")));
	     
	     List<String> ob=Arrays.asList("java","html","c","css","python");	     
	     System.out.println("length of string:"+ob.stream().collect(Collectors.groupingBy(String::length)));
	     
	     List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
	        
	        Optional<Integer> mostFrequent = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue())
	            .map(Map.Entry::getKey);
	        System.out.println("Most Frequent Occuring Element:"+mostFrequent);
	        
	        List<String> op = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

	        Map<Integer, List<String>> lengthMap = op.stream().collect(Collectors.groupingBy(String::length));
	        System.out.println("Convert List Of String to Map:"+op);
	          
	        
	}

	

}
