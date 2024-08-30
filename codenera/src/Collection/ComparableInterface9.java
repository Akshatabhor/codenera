package Collection;

import java.util.ArrayList;
import java.util.Collections;

class country11 implements Comparable<country11>
{
	private String gamename;
	private float win;
	public country11(String gamename, float win) {
		super();
		this.gamename = gamename;
		this.win = win;
	}
	@Override
	public int compareTo(country11 o) {
		
		if(win==o.win)
			return 0;
		else if(win<o.win)
			return -1;
	else
			return 1;
	}
	@Override
	public String toString() {
		return "\n[gamename=" + gamename + ", win=" + win + "]";
	}
	
	
}
	
public class ComparableInterface9 {
	public static void main(String[] args) 
	{
		 ArrayList<country11> al=new ArrayList<>();
	
		 country11 ob=new country11("ludo",12);
		 country11 ob2=new country11("carride",7);
		 country11 ob1=new country11("temple run",6);
		 al.add(ob);
		 al.add(ob2);
		 al.add(ob1);
		 System.out.println("\nGiven ArrayList:");
		 System.out.println(al);
		 
		
		 Collections.sort(al);
		 System.out.println("\nAfter Sorting:");
		 System.out.println(al);
}
}