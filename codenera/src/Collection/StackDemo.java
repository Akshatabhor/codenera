package Collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) 
    {
        Stack ob = new Stack();
        ob.push(11);
        ob.push(12);
        ob.push(13);
        ob.push(14);
        ob.push(15);
        System.out.println("given stack: " + ob);
        
        System.out.println("pop the element:"+ob.pop());
        System.out.println("after the poping:"+ob);
        System.out.println("peek the element:"+ob.peek());

        System.out.println("Search the element:"+ob.search(12));
        System.out.println("Empty element:"+ob.empty());
 
    }
}
