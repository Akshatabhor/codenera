/* Write a Java program to create an abstract class Animal witth
 * an abstract method called sound(). Create subclasses Lion and Tiger 
 * that extend the Animal class and implement the sound() method to make 
 * a specific sound for each animal.
*/

package Abstraction;
abstract class animal
{
	abstract void sound();
	}
class lion extends animal
{
	
	public void sound()
	{
		System.out.println("sound of lion");
	}
}
class tiger extends animal
{
	
	public void sound()
	{
		System.out.println("sound of tiger");
	}
}
public class Example1 
{

	public static void main(String[] args) 
	{
		tiger obj=new tiger();
		obj.sound();
		lion obj1=new lion();
		obj1.sound();
	}

}
