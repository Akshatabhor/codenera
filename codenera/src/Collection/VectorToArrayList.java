package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class VectorToArrayList {

	public static void main(String[] args) 
	{
		Vector<String> v = new Vector<String>();
		v.add("Trupti");
        v.add("Nisha");
        v.add("Ashwini");
        v.add("Gaurav");
        v.add("Akshata");
 
 
        System.out.println(" Vector :  " + v);
 
        ArrayList<String> ob = new ArrayList<String>();
 
        for (int i = 0; i < v.size(); i++)
            ob.add(v.get(i));
        System.out.println("\n ArrayList : " +ob);
    }

	}


