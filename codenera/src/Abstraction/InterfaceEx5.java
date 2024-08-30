/*Write a Java program to create an interface Drawable with a
 *  method draw() that takes no arguments and returns void. Create three classes
 *   Circle, Rectangle, and Triangle that implement the Drawable interface and 
 *   override the draw() method to draw their respective shapes.
 */


package Abstraction;
interface drawable
{
	void draw();
}
class circle2 implements drawable
{
	public void draw()
	{
		System.out.println("circle is drawable");
	}
}
class rectangle2 implements drawable
{
	public void draw()
	{
		System.out.println("rectangle is drawable");
	}
}
class triangle2 implements drawable
{
	public void draw()
	{
		System.out.println("triangle is drawable");
	}
}
public class InterfaceEx5 {

	public static void main(String[] args) 
	{
		drawable obj=new circle2();
		drawable obj1=new rectangle2();
		drawable obj2=new triangle2();
		obj.draw();
		obj1.draw();
		obj2.draw();
	}

}
