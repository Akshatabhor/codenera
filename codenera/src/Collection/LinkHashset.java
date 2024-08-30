package Collection;

import java.util.LinkedHashSet;

public class LinkHashset {

	public static void main(String[] args) 
	{
		LinkedHashSet LHobj =new LinkedHashSet();
		LHobj.add(20);
		LHobj.add(30);
		LHobj.add(40);
		LHobj.add(50);
		LHobj.add(50);
		LHobj.add(null);
		LHobj.add(null);
		LHobj.add(20);
	
		System.out.println(LHobj);

		LinkedHashSet LHobj1 =new LinkedHashSet();
		LHobj1.add(60);
		LHobj1.add(70);
		LHobj.addAll(LHobj1);
		System.out.println("Addall method:"+LHobj);
	}

}
