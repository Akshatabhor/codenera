package Collection;
import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerinterfaceBi //implements BiConsumer<Integer,String>
{

	public static void main(String[] args)
	{
		/*ConsumerinterfaceBi ob=new ConsumerinterfaceBi();
		ob.accept(1, "Akshata");
		ob.accept(2, "Ashwini");
		ob.accept(3, "Nisha");
		ob.accept(4, "komal");

	}

	@Override
	public void accept(Integer t, String u) 
	{
		System.out.println(t +" "+u);
	}*/

		//using lambda Exprepssion
		//BiConsumer<Integer,String> ob = (t,u) -> System.out.println(t+":"+u);
		//ob.accept(1, "java");
		
		HashMap<Integer,String> hmp=new HashMap();
		hmp.put(1,"java");
		hmp.put(2,"Android");
		hmp.put(3,"Python");
		hmp.put(7,"c++");
		hmp.put(4,"Html");
		
		BiConsumer<Integer,String> ob=(t,u) -> System.out.println(t+":"+u);
		hmp.forEach(ob);

}
}
