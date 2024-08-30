package RevisionPractice;

import java.util.ArrayList;

public class CommonElementOfArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(2);
        list2.add(3);
        list2.add(5);
        list2.add(6);

        list3.add(3);
        list3.add(2);
        list3.add(6);
        list3.add(7);

        ArrayList<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2); 
        commonElements.retainAll(list3); 

        System.out.println("Common elements in all three lists: " + commonElements);
	}

}
