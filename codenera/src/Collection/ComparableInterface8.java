package Collection;
import java.util.ArrayList;
import java.util.Collections;

class country12 implements Comparable<country12>
{
	private String cityname;
	private float popolation;
	public country12(String cityname, float popolation) {
		super();
		this.cityname = cityname;
		this.popolation = popolation;
	}
	@Override
	public int compareTo(country12 o) {
	
		if(popolation==o.popolation)
			return 0;
		else if(popolation<o.popolation)
			return -1;
	else
			return 1;
	}
	@Override
	public String toString() {
		return "\n[cityname=" + cityname + ", popolation=" + popolation + "]";
	}
	
}
public class ComparableInterface8 {
	public static void main(String[] args) 
	{
		 ArrayList<country12> al=new ArrayList<>();
	
		 country12 ob=new country12("latur",12082);
		 country12 ob2=new country12("pune",1176);
		 country12 ob1=new country12("mumbai",68971);
		 al.add(ob);
		 al.add(ob2);
		 al.add(ob1);
		 System.out.println("\nGivenArrayList:");
		 System.out.println(al);
		 
		
		 Collections.sort(al);
		 System.out.println("\nAfter Sorting:");
		 System.out.println(al);
}
}