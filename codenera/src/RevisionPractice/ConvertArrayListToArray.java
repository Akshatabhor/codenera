package RevisionPractice;

import java.util.ArrayList;

public class ConvertArrayListToArray {

	public static void main(String[] args)
	{
		ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        
        System.out.println("before convert the arrayList:"+arrayList);
        
        
        String[] array = arrayList.toArray(new String[0]);
        
        System.out.println("after convrting arraylist to array:");
        for (String element : array)
        {
            System.out.println(element);
        }

        
	}

}
