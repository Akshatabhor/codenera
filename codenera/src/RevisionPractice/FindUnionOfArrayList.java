package RevisionPractice;

import java.util.ArrayList;
import java.util.HashSet;

public class FindUnionOfArrayList {

	public static void main(String[] args) 
	{
		 ArrayList<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");
	        list1.add("Cherry");

	        ArrayList<String> list2 = new ArrayList<>();
	        list2.add("Banana");
	        list2.add("Date");
	        list2.add("Elderberry");
	        
	        ArrayList<String> unionList = findUnion(list1, list2);
	        System.out.println("Union of the two ArrayLists: " + unionList);

	       
	}
	 public static <T> ArrayList<T> findUnion(ArrayList<T> list1, ArrayList<T> list2) {
	        HashSet<T> set = new HashSet<>(list1);
	        set.addAll(list2);

	        return new ArrayList<>(set);
	    }

}
