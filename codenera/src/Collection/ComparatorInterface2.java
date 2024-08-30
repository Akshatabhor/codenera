package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie {
    private String title;
    private int releaseYear;

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "\n[title=" + title + ", releaseYear=" + releaseYear + "]";
    }
}


class ReleaseYearComparator implements Comparator<Movie> {
    @Override
    public int compare(Movie m1, Movie m2) {
        return Integer.compare(m1.getReleaseYear(), m2.getReleaseYear());
    }
}

public class ComparatorInterface2 {
    public static void main(String[] args) {
        Movie obj1 = new Movie("Dhrmaveer", 2021);
        Movie obj2 = new Movie("Chintu", 2025);
        Movie obj3 = new Movie("Kho-Kho", 2017);
        Movie obj4 = new Movie("Deul-Band", 2018);

        ArrayList<Movie> obj = new ArrayList<>();
        obj.add(obj1);
        obj.add(obj2);
        obj.add(obj3);
        obj.add(obj4);

        System.out.println("\nGiven ArrayList:" + obj);

      
        Collections.sort(obj, new ReleaseYearComparator());

        System.out.println("\nAfter Sorting:" + obj);
    }
}
