package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "(EmployeeName : "+name+" salary : "+salary+")\n";
    }
}
class CompareSalary implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.salary,o1.salary);
    }
}
public class ComparatorInterface1 {
    public static void main(String[] args) {
        Employee p1=new Employee("Om",800000);
        Employee p2=new Employee("Ram",48000);
        Employee p3=new Employee("Sham",415000);
        Employee p4=new Employee("Tom",1000000);
        ArrayList<Employee> al=new ArrayList<>();
        al.add(p3);
        al.add(p4);
        al.add(p1);
        al.add(p2);
        System.out.println("List of Employees  :\n"+al);
        Collections.sort(al,new CompareSalary());
        System.out.println("Sorted Salary In Decending Order :");
        System.out.println(al);
    }
}