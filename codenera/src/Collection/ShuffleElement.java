package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElement {

	public static void main(String[] args)
	{
		ArrayList obj=new ArrayList();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		System.out.println("before Shuffle arrayList:"+obj);
		Collections.shuffle(obj);
		System.out.println("after Shuffle arrayList:"+obj);

	}

}
