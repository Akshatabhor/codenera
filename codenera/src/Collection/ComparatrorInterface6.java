package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student5 {
    private String firstname;
    private String lastname;
    private int age;

    public Student5(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n[firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
    }
}

class StudentNameComparator implements Comparator<Student5> {
    public int compare(Student5 s1, Student5 s2) {
        int lastNameComparison = s1.getLastname().compareTo(s2.getLastname());
        if (lastNameComparison != 0) {
            return lastNameComparison;
        } else {
            return s1.getFirstname().compareTo(s2.getFirstname());
        }
    }
}

public class ComparatrorInterface6 {
    public static void main(String[] args) {
        Student5 obj1 = new Student5("Akshata", "Bhor", 24);
        Student5 obj2 = new Student5("Komal", "Kushekar", 26);
        Student5 obj3 = new Student5("Trupti", "Gholap", 28);
        Student5 obj4 = new Student5("Nisha", "Saswade", 22);

        ArrayList<Student5> obj = new ArrayList<>();
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("\nGiven ArrayList:" + obj);
        Collections.sort(obj, new StudentNameComparator());
        System.out.println("\nSorting ArrayList:" + obj);
    }
}
