package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Product1 {
    private String name;
    private double price;

    public Product1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "\n[name=" + name + ", price=" + price + "]";
    }
}

class NameComparator implements Comparator<Product1> {
    @Override
    public int compare(Product1 p1, Product1 p2) {
        return p1.getName().compareTo(p2.getName()); 
    }
}

public class ComparatorInterface3 {
    public static void main(String[] args) {
        Product1 obj1 = new Product1("Laptop", 55000);
        Product1 obj2 = new Product1("Mobile", 35000);
        Product1 obj3 = new Product1("Tablets", 15000);
        Product1 obj4 = new Product1("Beauty", 25000);

        ArrayList<Product1> products = new ArrayList<>();
        products.add(obj1);
        products.add(obj2);
        products.add(obj3);
        products.add(obj4);

        System.out.println("\nGiven ArrayList:" + products);


        Collections.sort(products, new NameComparator());

        System.out.println("\nAfter Sorting:" + products);
    }
}
