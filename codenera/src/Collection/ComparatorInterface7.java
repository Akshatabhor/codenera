package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Phone {
    private String name;
    private int batteryCapacity;

    public Phone(String name, int batteryCapacity) {
        this.name = name;
        this.batteryCapacity = batteryCapacity;
    }

    public String getName() {
        return name;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    @Override
    public String toString() {
        return "\n[name=" + name + ", batteryCapacity=" + batteryCapacity + "]";
    }
}

class BatteryCapacityComparator implements Comparator<Phone> {
    public int compare(Phone p1, Phone p2) {
        return Integer.compare(p1.getBatteryCapacity(), p2.getBatteryCapacity());
    }
}

public class ComparatorInterface7 {

    public static void main(String[] args) {
        Phone obj1 = new Phone("iPhone", 500);
        Phone obj2 = new Phone("Samsung", 200);
        Phone obj3 = new Phone("OnePlus", 400);
        Phone obj4 = new Phone("Realme", 300);

        ArrayList<Phone> obj = new ArrayList<>();
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("\nGiven ArrayList:" + obj);

        Collections.sort(obj, new BatteryCapacityComparator());
        System.out.println("\nSorted ArrayList:" + obj);
    }
}
