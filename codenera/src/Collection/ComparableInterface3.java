/*Implement Comparable for a Product class considering their prices.
*/

package Collection;

import java.util.ArrayList;
import java.util.Collections;

class product implements Comparable<product>
{

	private int id;
	private String name;
	private double price;
	
	public product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(product o) 
	{
		 return Double.compare(this.price, o.price);
	}

	@Override
	public String toString() {
		return "\n[id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
public class ComparableInterface3 {

	public static void main(String[] args) 
	{
		product obj1=new product(1,"shamppo",4500);
		product obj2=new product(2,"Bueaty care",7500);
		product obj3=new product(3,"smartphone",55000);
		product obj4=new product(4,"laptop",56500);
		product obj5=new product(5,"Tablets",44500);
		
		ArrayList <product> obj=new ArrayList();
		obj.add(obj1);
		obj.add(obj2);
		obj.add(obj3);
		obj.add(obj4);
		obj.add(obj5);
		
		System.out.println("\nGiven ArrayList:"+obj);
		
		Collections.sort(obj);
		System.out.println("\nAfter Sorting ArrayList:"+obj);

		

	}

}
