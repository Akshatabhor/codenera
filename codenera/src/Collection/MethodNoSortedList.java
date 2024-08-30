/*8. Write a Java program to sort a given array list.*/


package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class MethodNoSortedList
{
	
	    public static void main(String[] args)
	    {
	        ArrayList obj = new ArrayList();
	       // System.out.println("is arraylist is empty:"+obj.isEmpty());
	        obj.add(5);
	        obj.add(3);
	        obj.add(8);
	        obj.add(1);
	        obj.add(4);
	      //  System.out.println("is arraylist is empty:"+obj.isEmpty());

	        System.out.println("Unsorted ArrayList: " + obj);

	       // Collections.sort(obj);
	        obj.sort(null);
	        System.out.println("Sorted in asending ArrayList: " + obj);
	        
	        //Collections.sort(obj, Comparator.reverseOrder());
	        obj.sort(Comparator.reverseOrder());
	        System.out.println("sorted in decending order:"+obj);
	    }
	}


