package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) 
	{
		Set ob=new HashSet();
		ob.add(34);
		ob.add(48);
		ob.add(16);
		ob.add(10);
		ob.add(18);
		

		System.out.println(ob);
		
		Iterator I=ob.iterator();

		while(I.hasNext());
		{
			System.out.println(I.next());
		}
		
		/*String str1 = "Apple";
        String str2 = "kiwi";
        String str3 = "banana";
        String str4 = "mango";
        String str5 = "pinaple";
        
        System.out.println(str1 + " hashCode: " + str1.hashCode());
        System.out.println(str2 + " hashCode: " + str2.hashCode());
        System.out.println(str3 + " hashCode: " + str3.hashCode());
        System.out.println(str4 + " hashCode: " + str4.hashCode());
        System.out.println(str5 + " hashCode: " + str5.hashCode());

        HashSet<String> ob = new HashSet<>();
        ob.add("Apple");
        ob.add("kiwi");
        ob.add("banana");
        ob.add("mango");
        ob.add("pinaple");
        
        System.out.println(ob);
        
        Iterator<String> I = ob.iterator();
        while (I.hasNext()) 
        {
            String element = I.next();
            System.out.println(element);
        }*/
		
		}

}
