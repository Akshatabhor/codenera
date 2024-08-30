package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class song1
{
	private String title;
	private String artistname;
	private int duration;
	public song1(String title, String artistname, int duration) {
		super();
		this.title = title;
		this.artistname = artistname;
		this.duration = duration;
	}
	public String getTitle() {
		return title;
	}
	public String getArtistname() {
		return artistname;
	}
	public int getDuration() {
		return duration;
	}
	@Override
	public String toString() {
		return "\n[title=" + title + ", artistname=" + artistname + ", duration=" + duration + "]";
	}
}
class ArtistNameComparator implements Comparator<song1>{
	 public int compare(song1 s1, song1 s2) {
		 return s1.getArtistname().compareTo(s2.getArtistname());
	 }
}
public class ComparatorInterface9 
{

	public static void main(String[] args)
	{
		song1 obj1=new song1("ABC","Nisha",50);
		song1 obj2=new song1("DEF","Ashwini",20);
		song1 obj3=new song1("GHI","Komal",80);
		song1 obj4=new song1("JKL","Trupti",30);
		
		ArrayList obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);

		System.out.println("\nGiven ArrayList:"+obj);
		
		Collections.sort(obj, new ArtistNameComparator() );
		System.out.println("\nSorting ArrayList:"+obj);
		

	}

}
