/*Write a Java program to create an interface Resizable with methods 
 * resizeWidth(int width)
 *  and resizeHeight(int height) that allow an object to be resized.
 *   Create a class Rectangle 
 *  that implements the Resizable interface and 
 * implements the resize methods.
 */
package Abstraction;
interface Resizable
{
	void resizablewidth(int width);
	void resizableheight(int height);
	
}
class Rectangle5 implements Resizable 
{
	int width;
	int height;
	public Rectangle5(int width, int height)
	{
		this.width=width;
		this.height=height;
	}
	public int getwidth()
	{
		return width;
	}
	public int getheight()
	{
		return height;
	}
	public void resizablewidth(int width)
	{
		this.width=width;
	}
	public void resizableheight(int height)
	{
		this.height=height;
	}
	public void display()
	{
		System.out.println("area of rectangle:"+(width*height));
	}
}

public class InterfaceEx4 {

	public static void main(String[] args) 
	{
		Rectangle5 obj=new Rectangle5(20,30);
		obj.display();
		obj.resizablewidth(20);
		obj.resizableheight(10);
		obj.display();
		
		
	}

}
