package Collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamAPI11 {

	public static void main(String[] args)
	{

		List<Integer> ob =  Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,8,5);
		
		List<Integer> EvenNumbers = ob.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList()); 
		System.out.println("EvenNumbers is:"+EvenNumbers);
		//int SumEven=ob.stream().filter(i->i%2==0).mapToInt(i->i).sum();
		//System.out.println("Even no Sum:"+SumEven);
		
		//Double avg=ob.stream().mapToDouble(i->i).average().getAsDouble();
		//System.out.println("Average :"+avg);
		
		//int max=ob.stream().mapToInt(i->i).max().getAsInt();
		//System.out.println("Max no:"+max);
		
		//int min=ob.stream().mapToInt(i->i).min().getAsInt();
		//System.out.println("Min no:"+min);
		
	}

}
