package Collection;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) 
	{
		Vector ob=new Vector();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(5);
		ob.add(4);
		
		System.out.println("1st vector list:"+ob);
		/*System.out.println("remove element:"+ob.remove(2));
		System.out.println(ob);*/
		
		for(int i=0;i<ob.size();i++)
		{
			for(int j=i+1;j<ob.size();j++)
			{
				if(ob.get(i).equals(ob.get(j)))
				{
					ob.remove(j);
				}
			}
			
		}
		System.out.println("remove dublicate:"+ob);

       /* int sum =0;
        for(int i=0;i<=5;i++)
        {
        	sum=sum+i;
        }
        System.out.println("sum of vector element:"+sum);*/
		

		
		//ob.addElement(21);
		//ob.addElement(22);
		//ob.addElement(23);
		
		//System.out.println("after adding the element:"+ob);
		
		//if(ob.contains(30))
		//{
			//System.out.println("in vector list 30 are present");
		//}
		//else
		//{
		//	System.out.println("in vector list 30 are not present");

		//}
		//ob.get(5);
		//System.out.println(ob.get(5));
		//ob.elementAt(2);
		//System.out.println("Element At:"+ob.elementAt(2));
		//ob.firstElement();
		//System.out.println("first element:"+ob.firstElement());
		//System.out.println("last element:"+ob.lastElement());
		//System.out.println("index of:"+ob.indexOf(21));
		
		/*Vector obj=new Vector();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		System.out.println("2nd vector list:"+obj);
		System.out.println("Equal check:"+ob.equals(obj));*/
		
		//Object arr[]=ob.toArray();
		//System.out.println("vector to array conversion:"+Arrays.toString(arr));
		
		//System.out.println("remove method:"+ob.remove(0));
		//System.out.println("remove all method:"+ob.removeAll(obj));
		
		//ob.trimToSize();
		//System.out.println("trim to size:"+ob);*/
		//ob.sort(null);
		//System.out.println("sort:"+ob);
		/*ob.clone();
		System.out.println("clone method:"+ob);
		ob.clear();
		System.out.println("clear method:"+ob);*/
		
		
		


	}

}
