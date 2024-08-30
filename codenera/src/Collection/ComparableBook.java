package Collection;
import java.util.ArrayList;
import java.util.Collections;

class Books implements Comparable<Books>{
    private String bookName;

    public String getBookName() {
        return bookName;
    }
    public Books(String bookName) {
        this.bookName = bookName;
    }
    @Override
    public int compareTo(Books o) {
       return this.bookName.compareTo(o.bookName);
    }
}
public class ComparableBook {
    public static void main(String[] args) {
        ArrayList<Books>al=new ArrayList<>();
        al.add(new Books("Gandhi: A Life in Three Campaigns"));
        al.add(new Books("Four Stars of Destiny"));
        al.add(new Books("God Father"));
        al.add(new Books("BhagvtGita"));
        System.out.println("Given ArrayList:");
        System.out.println("---------------");
        print(al);
        Collections.sort(al);
        System.out.println("----------------");
        System.out.println("After Sorting:");
        System.out.println("---------------");
        print(al);
    }
    public static void print(ArrayList<Books> al){
        for (Books b:al){
            System.out.println(b.getBookName());
        }
    }
}