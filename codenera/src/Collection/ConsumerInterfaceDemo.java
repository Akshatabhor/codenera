package Collection;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo 
{

	public static void main(String[] args)
	{
		Consumer<String> ob=(t) ->{
			System.out.println("Consumer Interface:"+t);
		};
		ob.accept("java");
	}

}
