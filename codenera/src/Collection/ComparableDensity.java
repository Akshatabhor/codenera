package Collection;

import java.util.ArrayList;
import java.util.Collections;

class density implements Comparable<density>
{
	private String area;
	private int population;
	public density(String area, int population) {
		super();
		this.area = area;
		this.population = population;
	}
	public String getArea() {
		return area;
	}
	public int getPopulation() {
		return population;
	}
	
	@Override
	public String toString() {
		return "\n[area=" + area + ", population=" + population + "]";
	}
	@Override
	public int compareTo(density o) 
	{
		//return Integer.compare(population, o.population);//asending order
		return Integer.compare(o.population, population);//decending order
	}
	
	
	
}
public class ComparableDensity 
{

	public static void main(String[] args)
	{
		density ob1=new density("Mumbai", 45000);
		density ob2=new density("Pune", 29000);
		density ob3=new density("Kolapur", 35000);
		density ob4=new density("Nashik", 95000);
		density ob5=new density("Nagpur", 75000);

		ArrayList<density> ob=new ArrayList();
		ob.add(ob1);
		ob.add(ob2);
		ob.add(ob3);
		ob.add(ob4);
		ob.add(ob5);
		System.out.println("Given ArrayList:"+ob);
		
		Collections.sort(ob);
		
		System.out.println("after sorting:"+ob);

		
	}

}
