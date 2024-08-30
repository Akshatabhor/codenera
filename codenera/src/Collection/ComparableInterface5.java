package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private int duration;
    
    
    public Song(String title, String artist, int duration) {
		super();
		this.title = title;
		this.artist = artist;
		this.duration = duration;
	}

    
	@Override
	public int compareTo(Song other) {
        return Integer.compare(this.duration, other.duration);
    }
	
	@Override
    public String toString() {
        return "\n{title='" + title + "', artist='" + artist + "', duration=" + duration + " seconds}";
    }

}

public class ComparableInterface5 
{
    public static void main(String[] args)
    {
    	Song obj1=new Song("ABC","Artist 1",30);
    	Song obj2=new Song("DEF","Artist 2",20);
    	Song obj3=new Song("GHI","Artist 3",70);
    	Song obj4=new Song("JKL","Artist 4",50);
    	
    	ArrayList<Song> obj=new ArrayList();
    	obj.add(obj1);
    	obj.add(obj2);
    	obj.add(obj3);
    	obj.add(obj4);
    	
    	System.out.println("\nGiven ArrayList:"+obj);
    	Collections.sort(obj);
    	System.out.println("\nAfter Sorting:"+obj);

    }
}

