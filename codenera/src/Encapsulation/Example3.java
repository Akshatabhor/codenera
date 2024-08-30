/*Write a Java program to create a class called Rectangle with 
private instance variables length and width. 
Provide public getter and setter methods to access and modify these variables.*/

package Encapsulation;
class rectangle
{
	private int length;
	private int width;
	public void setlength(int length)
	{
		this.length=length;
	}
	public void setwidth(int width)
	{
		this.width=width;
	}
	public int getLength() 
	{
		return length;
	}
	public int getWidth() 
	{
		return width;
	}
	
}
public class Example3 
{

	public static void main(String[] args) 
	{
		rectangle obj=new rectangle();
		obj.setlength(10);
		obj.setwidth(20);
		System.out.println("length of rectangle"+obj.getLength());
		System.out.println("width of rectangle:"+obj.getWidth());
		System.out.println("area of rectangle:"+obj.getLength()*obj.getWidth());
	}

}
