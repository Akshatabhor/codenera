package Collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class order {
    private int id;
    private LocalDate orderDate;

    public order(int id, LocalDate orderDate) {
        this.id = id;
        this.orderDate = orderDate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "\n[id=" + id + ", orderDate=" + orderDate + "]";
    }
}

class OrderDateComparator implements Comparator<order> {
    @Override
    public int compare(order o1, order o2) {
        return o1.getOrderDate().compareTo(o2.getOrderDate());
    }
}

public class Compa8atorInterface7 {
    public static void main(String[] args) {
        order obj1 = new order(1, LocalDate.of(2023, 7, 19));
        order obj2 = new order(2, LocalDate.of(2012, 5, 20));
        order obj3 = new order(3, LocalDate.of(2018, 1, 1));
        order obj4 = new order(4, LocalDate.of(2024, 9, 11)); 

        ArrayList<order> obj = new ArrayList<order>();
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("\nGiven ArrayList: " + obj);

        Collections.sort(obj, new OrderDateComparator());
        System.out.println("\nSorted ArrayList: " + obj);
    }
}
