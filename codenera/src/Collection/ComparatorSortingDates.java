package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class SortDates
{
	private String name;
	private String date;
	public SortDates(String name, String date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	@Override
	public String toString() {
		return "\n[name=" + name + ", date=" + date + "]";
	}
	
	
}
class DateComp implements Comparator<SortDates>
{

	@Override
	public int compare(SortDates o1, SortDates o2) {
		
		//return o2.getDate().compareTo(o1.getDate());//decending order
		return o1.getDate().compareTo(o2.getDate());//Assending order
	}
	
}
public class ComparatorSortingDates 
{

	public static void main(String[] args) 
	{
		ArrayList<SortDates> ob=new ArrayList<>();
		ob.add(new SortDates("Monday", "20-7-1999"));
		ob.add(new SortDates("Thusday", "18-7-1999"));
		ob.add(new SortDates("Wendsday", "28-7-1999"));
		ob.add(new SortDates("Thrusday", "22-7-1999"));
		ob.add(new SortDates("Friday", "15-7-1999"));
		ob.add(new SortDates("Saturday", "23-7-1999"));
		ob.add(new SortDates("Sunday", "25-7-1999"));
		
		System.out.println("Given ArrayList:"+ob);
		
		Collections.sort(ob, new DateComp());
		
		System.out.println("After sorting by Date:\n");
		System.out.println(ob);


	}

}
