package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        TreeSet<Integer> tobj = new TreeSet<>();
        tobj.add(20);
        tobj.add(35);
        tobj.add(15);
        tobj.add(18);
        tobj.add(13);
        tobj.add(10);
        tobj.add(30);
        
        System.out.println(tobj);
        
       /* Iterator iobj=tobj.iterator();
        while(iobj.hasNext())
        {
        	System.out.println(iobj.next());
        }*/
        
        TreeSet tobj1=new TreeSet();
        tobj1.add(40);
        tobj1.add(50);
        tobj.addAll(tobj1);
        System.out.println("addAll Method:"+tobj);//Add the all element
        
        System.out.println("Ceiling Method:"+tobj.ceiling(16));//get greater element with mention 
        System.out.println("floor Method:"+tobj.floor(31));//get lower element with mention 
        System.out.println("Higher:"+tobj.higher(20));//get greater element with mention 
        System.out.println("Lower:"+tobj.lower(20));//get less element with mention
        System.out.println("PollFirst:"+tobj.pollFirst());//remove first element
        System.out.println("PollLast:"+tobj.pollLast());//remove last element
        System.out.println("After the poll Methods:"+tobj);
        System.out.println("contains Method:"+tobj.contains(35));
        System.out.println("ContainsAll method:"+tobj.containsAll(tobj1));


        
    }

}
