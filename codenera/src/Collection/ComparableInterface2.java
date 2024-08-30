/*Create a class Book that implements Comparable and 
 * compares books based on their titles.
*/

package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Books1 implements Comparable<Books1> {
    private int srno;
    private String title;
    private int price;

    public Books1(int srno, String title, int price) {
        this.srno = srno;
        this.title = title;
        this.price = price;
    }

    @Override
    public int compareTo(Books1 o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "\nBooks[srno=" + srno + ", title=" + title + ", price=" + price + "]";
    }
}

public class ComparableInterface2 {
    public static void main(String[] args) {
        ArrayList<Books1> al = new ArrayList<>();
        Books1 ob = new Books1(1, "The Great Gatsby", 3401);
        Books1 ob2 = new Books1(12, "Pride and Prejudice", 3410);
        Books1 ob1 = new Books1(11, "To Kill a Mockingbird", 3404);

        al.add(ob);
        al.add(ob2);
        al.add(ob1);

        System.out.println("Given ArrayList:");
        System.out.println(al);

        Collections.sort(al);

        System.out.println("After Sorting:");
        System.out.println(al);
    }
}
