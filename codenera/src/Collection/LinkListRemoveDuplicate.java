package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkListRemoveDuplicate {

	 public static void main(String[] args) {
	        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana"));
	        
	        // Convert list to HashSet to remove duplicates
	        Set<String> set = new HashSet<>(list);
	        
	        // Convert back to list
	        list = new ArrayList<>(set);
	        
	        System.out.println(list);
	    }

	

	}


