/*Write a Java program to create an abstract class Animal 
 * with abstract methods eat() and sleep(). 
 * Create subclasses Lion, Tiger, and Deer that extend the Animal class
 *  and implement the eat() and sleep() methods differently 
 *  based on their specific behavior.
*/

package Abstraction;
abstract class animal1
{
	abstract void eat();
	abstract void sleep();
}
class lion1 extends animal1
{
	public void eat()
	{
		System.out.println("lion are eating multiple food");
	}
	public void sleep()
	{
		System.out.println("line are sleeping");
	}
}
class tiger1 extends animal1
{
	public void eat()
	{
		System.out.println("tiger are eating multiple food");
	}
	public void sleep()
	{
		System.out.println("tiger are sleeping");
	}
}
class deer1 extends animal1
{
	public void eat()
	{
		System.out.println("deer are eating multiple food");
	}
	public void sleep()
	{
		System.out.println("deer are sleeping");
	}
}
public class Example4 {

	public static void main(String[] args) 
	{
		deer1 obj=new deer1();
		obj.eat();
		obj.sleep();
		tiger1 obj1=new tiger1();
		obj1.eat();
		obj1.sleep();
		lion1 obj2=new lion1();
		obj2.eat();
		obj2.sleep();
	}

}
