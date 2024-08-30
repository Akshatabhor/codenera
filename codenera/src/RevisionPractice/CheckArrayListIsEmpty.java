package RevisionPractice;

import java.util.ArrayList;

public class CheckArrayListIsEmpty {

	public static void main(String[] args) 
	{
		ArrayList<String> ob=new ArrayList();
		//ob.add("hello");
		//ob.add("java");
		//ob.add("language");
		
		if(ob.isEmpty())
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
	}

}
