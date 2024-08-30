package Collection;
import java.util.ArrayList;

public class UpdateMethod 
{
    public static void main(String[] args) 
    {
        System.out.println("Color List:");
        ArrayList obj=new ArrayList<>();
        obj.add("Blue");
        obj.add("Green");
        obj.add("Yellow");
        obj.add(0,"Red");
        for (int i = 0; i < obj.size(); i++) 
        {
            System.out.println(obj.get(i));
        }
        System.out.println("After updating at index: 2:");
        obj.set(2,"pink");
        for (int i = 0; i < obj.size(); i++) 
        {
            System.out.println(obj.get(i));
        }
    }
}
