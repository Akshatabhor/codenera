package Collection;

import java.util.ArrayList;
import java.util.Collections;

class country1 implements Comparable<country1>
{
	private String countryname;
	private float population;
	
	public country1(String countryname, float population) {
		super();
		this.countryname = countryname;
		this.population = population;
	}

	@Override
	public int compareTo(country1 o) {
		
		if(population==o.population)
			return 0;
		else if(population<o.population)
			return -1;
	else
			return 1;
	}

	@Override
	public String toString() {
		return "\n[countryname=" + countryname + ", population=" + population + "]";
	}
	
	
}
public class ComparableInterface10 {

	public static void main(String[] args) 
	{
		 ArrayList<country1> al=new ArrayList<>();
	
		 country1 ob=new country1("india",1208276);
		 country1 ob2=new country1("china",1175676);
		 country1 ob1=new country1("america",689697);
		 al.add(ob);
		 al.add(ob2);
		 al.add(ob1);
		 System.out.println("\nGiven ArrayList:");
		 System.out.println(al);
		 
		
		 Collections.sort(al);
		 System.out.println("\nSorting ArrayList:");
		 System.out.println(al);
}
}