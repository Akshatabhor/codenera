package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerInterfaceArrayList {

	public static void main(String[] args) 
	{
		Consumer<Integer> ob=(t) -> System.out.println("Consumer Interface:"+t);

		ArrayList al=new ArrayList(Arrays.asList(1,2,3,4,5));
		
		al.forEach(ob);
	}

}
