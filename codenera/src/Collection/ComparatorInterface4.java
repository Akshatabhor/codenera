package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class student1 {
    private String name;
    private int age;

    public student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n [name=" + name + ", age=" + age + "]";
    }
}

class AgeComparator implements Comparator<student1> {
    @Override
    public int compare(student1 s1, student1 s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }
}

public class ComparatorInterface4 {
    public static void main(String[] args) {
        student1 obj1 = new student1("Akshata", 24);
        student1 obj2 = new student1("Trupti", 25);
        student1 obj3 = new student1("Komal", 19);
        student1 obj4 = new student1("Pooja", 15);
        student1 obj5 = new student1("Rucha", 28);

        ArrayList<student1> students = new ArrayList<>();
        students.add(obj1);
        students.add(obj2);
        students.add(obj3);
        students.add(obj4);
        students.add(obj5);

        System.out.println("\nGiven ArrayList:" + students);

 
        Collections.sort(students, new AgeComparator());

        System.out.println("\nAfter Sorting ArrayList:" + students);
    }
}
