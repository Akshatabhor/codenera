package Collection;

import java.util.HashSet;

public class SetMethod
{

	public static void main(String[] args)
	{
		String str = "nmo";
		System.out.println("Hashcode of Str : " + str.hashCode());
		HashSet ob = new HashSet();
		ob.add("23");
		ob.add("15");
		ob.add(21);
		ob.add(13);
		ob.add(14);
		System.out.println(ob);
		ob.addAll(ob);
		System.out.println("addAll() : " + ob);
		System.out.println("Contains method");
		if(ob.contains(14))
		{
			System.out.println("14 is present in given set");
		}
		else
		{
			System.out.println("14 is not present in given set");
		}
		ob.containsAll(ob);
		System.out.println("ContainsAll() : " + ob);
		
		HashSet ob1 = new HashSet();
		
		ob1.add("23");
		ob1.add("15");
		ob1.add(21);
		ob1.add(13);
		ob1.add(14);
		if(ob.equals(ob1))
		{
			System.out.println("Both sets are equals");
		}
		else
		{
			System.out.println("Both sets are not equals");
		}
		
		System.out.println("isEmpty() : " + ob.isEmpty());
		
		System.out.println("retainAll() : " + ob.retainAll(ob));
//		ob.clear();
//		System.out.println("clear() : " + ob);
		ob.remove("abcd");
		System.out.println("remove(abcd) : " + ob);
		
		ob.removeAll(ob1);
		System.out.println("removeAll() : " + ob);
		
		ob.clear();
		System.out.println("clear() : " + ob);

	}

}