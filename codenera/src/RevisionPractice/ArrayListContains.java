package RevisionPractice;

import java.util.ArrayList;

public class ArrayListContains {
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        String elementToCheck = "Cherry";

        if (list.contains(elementToCheck)) 
        {
            System.out.println("The ArrayList contains the element: " + elementToCheck);
        } 
        else 
        {
            System.out.println("The ArrayList does not contain the element: " + elementToCheck);
        }
    }
}
