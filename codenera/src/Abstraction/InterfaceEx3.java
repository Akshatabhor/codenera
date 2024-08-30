/*Write a Java program to create an interface Flyable 
 * with a method called fly_obj(). 
 * Create three classes Spacecraft, Airplane, and 
 * Helicopter that implement the Flyable interface. 
 * Implement the fly_obj() method for each of the three classes.
 */

package Abstraction;
interface flyable
{
	void fly_obj();
}
class spacecraft implements flyable
{
	public void fly_obj()
	{
		System.out.println("it is a spacecraft");
	}
}
class airplane implements flyable
{
	public void fly_obj()
	{
		System.out.println("it is a airplane");
	}
}
class helicopter implements flyable
{
	public void fly_obj()
	{
		System.out.println("it is a helicopter");
	}
}
public class InterfaceEx3 {

	public static void main(String[] args) 
	{
		flyable spacecraft=new spacecraft();
		flyable airplane=new airplane();
		flyable helicopter=new helicopter();
		
		spacecraft.fly_obj();
		airplane.fly_obj();
		helicopter.fly_obj();
		
		
		
	}

}
