package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {

	private static final String Null = null;

	public static void main(String[] args) 
	{
		List<Integer> ob =  Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,8,5);
		List ob1=ob.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even No"+ob1);
		List ob2=ob.stream().filter(i->i%2==1).collect(Collectors.toList());
		System.out.println("Odd No"+ob2);
		List ob3=ob.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct:"+ob3);
		
		List EvenSq=ob.stream().filter(i->i%2==0).map(i->i*i).toList();
		System.out.println("Even No Square:"+EvenSq);
		
		int SumEven=ob.stream().filter(i->i%2==0).mapToInt(i->i).sum();
		System.out.println("Even no Sum:"+SumEven);
		
		Double avg=ob.stream().mapToDouble(i->i).average().getAsDouble();
		System.out.println("Avg:"+avg);
		
		int max=ob.stream().mapToInt(i->i).max().getAsInt();
		System.out.println("Max no:"+max);
		
		long count=ob.stream().mapToInt(i->i).count();
		System.out.println("Count of List:"+count);
		
		List<String> obj=Arrays.asList("Akshata","Omkar","Null","Vishal","Ashwini","Komal","Nisha");
		System.out.println(obj);
		System.out.println("Uppercase:"+obj.stream().map(String::toUpperCase).toList());
		
		System.out.println("LowerCase:"+obj.stream().map(String::toLowerCase).toList());
		List AsendingSort=obj.stream().sorted().toList();
		System.out.println("AsendingSort:"+AsendingSort);
		
		List RemoveNull=obj.stream().filter(s->s!=Null).toList();
		System.out.println(RemoveNull);
		
		
		
		
		
		
		
		
	

	}

}
