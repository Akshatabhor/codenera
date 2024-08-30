package Collection;
/*Q1.Write a program to create a stream from a list of integers and print each element.
 * Q2.Implement a program to filter even numbers from a list using the Stream API.
 * Q3. Write a program to find the sum of all elements in a list using streams.
 * Q4. Implement a program to find the maximum element from a list using streams.
 * Q5. Write a program to count the number of elements in a list using streams.
 * Q6. Implement a program to convert a list of strings to uppercase using streams.
 * Q7. Write a program to sort a list of strings in ascending order using streams.
Q8. Implement a program to find the average of all numbers in a list using streams.
Q9. Write a program to find the square of each element in a list using streams.
Q10. Implement a program to check if all elements in a list are greater than a certain value using streams.
Q11. Write a program to find the first occurrence of a given element in a list using streams.
Q12. Implement a program to find the distinct elements in a list using streams.
Q14. Implement a program to concatenate two lists using streams.



*/import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI2 {


	private static final String Null = null;
	private static Optional<Integer> MaxElement;
	

	public static void main(String[] args)
	{
		List<Integer> ob =  Arrays.asList(1,2,3,4,5);
		ob.stream().forEach(System.out::println);
		List<Integer> o1 =  Arrays.asList(6,7,8,9,10);
		ob.stream().forEach(System.out::println);
		List ob1=ob.stream().filter(i->i%2==0).toList();
		System.out.println("Even No:"+ob1);
		int ob2=ob.stream().mapToInt(i->i).sum();
		System.out.println("Sum Of All Elements:"+ob2);
		
		 MaxElement = ob.stream().max(Integer::compareTo);
		 System.out.println("Maximum element from List:"+MaxElement);
		 
		 long count = ob.stream().mapToInt(i->i).count();
		 System.out.println("Count The Element:"+count);
		 
		List<String> obj=Arrays.asList("Akshata","Omkar","Null","Vishal","Ashwini","Komal","Nisha");
		System.out.println(obj);
		System.out.println("Uppercase:"+obj.stream().map(String::toUpperCase).toList());
		
		List Asending=obj.stream().sorted().toList();
		System.out.println("Asending order:"+Asending);
		
		double avg = ob.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println("Average Of All Numbers:"+avg);
		
		List Square=ob.stream().map(i->i*i).toList();
		System.out.println("Square of all Element:"+Square);
		int Threshold=0;
		boolean Greater=ob.stream().allMatch(i -> i >Threshold);
		if(Greater)
		{
			System.out.println("All element are greater than:"+Threshold);
		}
		else
		{
			System.out.println("Not All element are greater than:"+Threshold);

		}
		int target=2;
		Optional<Integer> FirstOccureanc = ob.stream().filter(i->i>target).findFirst();
		if(FirstOccureanc.isPresent())
		{
            System.out.println("The first occurrence of " + target + " is at index: " + ob.indexOf(FirstOccureanc.get()));

		}
		else
		{
			System.out.println(target+"is not present in List");
		}
		
		List<Integer> ob3=ob.stream().distinct().toList();
		System.out.println("Distinct:"+ob3);
		
		
		
		List<Integer> ob4=Stream.concat(ob.stream(), o1.stream()).toList();
		System.out.println("Concat :"+ob4);
	
		
		 
		 
	}

}
