package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLength implements Comparator<String>
{

	@Override
	public int compare(String s1,String s2)
	{
		//return Integer.compare(s1.length(),s2.length());//Asending order
		return Integer.compare(s2.length(),s1.length());//decending order
	}

	

	
	
}
public class ComparatorLength 
{

	public static void main(String[] args)
	{
		ArrayList<String> ob=new ArrayList<>();
		ob.add("java");
		ob.add("is");
		ob.add("simple");
		ob.add("programming");
		ob.add("language");
		System.out.println("given Arraylist of String:"+ob);
		
		Collections.sort(ob, new StringLength());
		System.out.println("After the sorting by length of String:"+ob);

	}

}
