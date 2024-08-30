package Collection;

import java.util.ArrayList;
import java.util.Collections;

class clgstudent implements Comparable<clgstudent> {

    private String name;
    private double GPA;

    // Constructor
    public clgstudent(String name, double GPA) {
      
        this.name = name;
        this.GPA = GPA;
    }

  
    @Override
    public String toString() {
        return "\n[ name=" + name + ", GPA=" + GPA + "]";
    }

 
    @Override
    public int compareTo(clgstudent other) {
        return Double.compare(this.GPA, other.GPA);
    }
}

public class ComparableInterface4 {
    public static void main(String[] args) {
    	clgstudent obj1 = new clgstudent("Akshata", 8.90);
    	clgstudent obj2 = new clgstudent("Nisha", 7.90);
    	clgstudent obj3 = new clgstudent("Ashwini", 6.90);
    	clgstudent obj4 = new clgstudent("Pooja", 9.90);
    	clgstudent obj5 = new clgstudent("Rucha", 5.90);

        ArrayList<clgstudent> obj = new ArrayList<>();
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);
        obj.add(obj5);

        System.out.println("\nGiven ArrayList:" + obj);
        Collections.sort(obj);
        System.out.println("\nAfter Sorting ArrayList:" + obj);
    }
}
