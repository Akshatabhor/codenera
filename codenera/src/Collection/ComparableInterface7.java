package Collection;

import java.util.ArrayList;
import java.util.Collections;

class Car implements Comparable<Car> {
    private String model;
    private int topSpeed;
    
    
    public Car(String model, int topSpeed) {
		super();
		this.model = model;
		this.topSpeed = topSpeed;
	}
    @Override
    public int compareTo(Car o) 
    {
    	return Integer.compare(this.topSpeed, o.topSpeed);
    }
	@Override
	public String toString() {
		return "\n[model=" + model + ", topSpeed=" + topSpeed + "]";
	}
    
}

public class ComparableInterface7 {

	public static void main(String[] args)
	{
		Car obj1=new Car("model A",250);
		Car obj2=new Car("model B",500);
		Car obj3=new Car("model C",400);
		Car obj4=new Car("model D",800);
		
		ArrayList<Car> obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);

		System.out.println("\nGiven ArrayList:"+obj);
		Collections.sort(obj);
		System.out.println("After Sorting:"+obj);

	}

}


