package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class event
{
	private int id;
	private String eventname;
	private int duration;
	public event(int id, String eventname, int duration) {
		super();
		this.id = id;
		this.eventname = eventname;
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public String getEventname() {
		return eventname;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "\n[id=" + id + ", eventname=" + eventname + ", duration=" + duration + "]";
	}
}
class EventDurationComparator implements Comparator<event>{
	public int compare(event e1, event e2) {
		 return Integer.compare(e1.getDuration(), e2.getDuration());
		
	}
}
public class ComparatorInterface10 
{

	public static void main(String[] args) 
	{
		event obj1=new event(1,"Dancing",30);
		event obj2=new event(2,"singing",15);
		event obj3=new event(3,"gaming",60);
		event obj4=new event(4,"Speech",45);
		
		ArrayList<event> obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);
		
		System.out.println("\nGiven ArrayList:"+obj);
		
		Collections.sort(obj, new EventDurationComparator());
		System.out.println("\nSorting ArrayList:"+obj);


	}

}
