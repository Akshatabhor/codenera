package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class emp {
	private int empid;
	private String name;
	private int salary;

	public emp(int empid, String name, int salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "\n[empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
}

class salarycomp implements Comparator<emp> {
	@Override
	public int compare(emp o1, emp o2) {
		if (o1.getSalary() == o2.getSalary())
			return 0;
		else if (o1.getSalary() < o2.getSalary())
			return -1;
		else
			return 1;
	}
}

class namecomp implements Comparator<emp> {
	@Override
	public int compare(emp o1, emp o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class comparatorInterface {
	public static void main(String[] args) {
		ArrayList<emp> ob = new ArrayList<>();
		ob.add(new emp(101, "suraj", 25000));
		ob.add(new emp(102, "akshata", 55000));
		ob.add(new emp(103, "gaurav", 65000));
		ob.add(new emp(104, "komal", 30000));
		ob.add(new emp(105, "nisha", 48000));

		System.out.println("Given ArrayList:" + ob);

		Collections.sort(ob, new salarycomp());
		
		System.out.println("After sorting by salary:\n");
		System.out.println("EmpId\tEmpName\tEmpSalary");
		for (emp e : ob) {
			System.out.println(e.getEmpid() + "\t" + e.getName() + "\t" + e.getSalary());
		}

		
		
		Collections.sort(ob, new namecomp());
		
		
		System.out.println("After sorting by name:\n");
		System.out.println("EmpId\tEmpName\tEmpSalary");
		for (emp e : ob) {
			System.out.println(e.getEmpid() + "\t" + e.getName() + "\t" + e.getSalary());
		}
	}
}
