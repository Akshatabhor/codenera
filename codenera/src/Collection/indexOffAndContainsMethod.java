package Collection;

import java.util.ArrayList;

public class indexOffAndContainsMethod {

	public static void main(String[] args) 
	{
		ArrayList obj=new ArrayList();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(11);
		obj.add(11);
		obj.add(15);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		
		ArrayList obj2 =new ArrayList();
		obj2.add(11);
		obj2.add(12);
		obj2.add(50);
		obj2.add(52);
		System.out.println("element of second arraylist:"+obj2);

		obj.retainAll(obj2);
		System.out.println("retain all :"+obj);
		//obj.removeAll(obj2);
		//System.out.println("element of second arraylist:"+obj2);
		//System.out.println("remove all element:"+obj);
		System.out.println("first index of 11:"+obj.indexOf(11));
		System.out.println("last index of 11s:"+obj.lastIndexOf(11));
		
		int ele=50;
		if(obj.contains(ele))
		{
			System.out.println("it is present");
		}
		else
		{
			System.out.println("it in not present");
		}
		
		ArrayList obj1=(ArrayList)obj.clone();
		System.out.println("clone of ArrayList:"+obj1);
		
		obj.clear();
		System.out.println("clear the arraylist:"+obj);
		
	}

}
