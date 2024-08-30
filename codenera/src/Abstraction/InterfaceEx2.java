/* Write a Java program to create a Animal
 *  interface with a method called bark() that takes no
 *   arguments and returns void. Create a Dog class that 
 *   implements Animal and overrides speak() 
 *   to print "Dog is barking".
 */

package Abstraction;
interface animal3
{
	 void bark();
}
class dog implements animal3
{
	public void bark()
	{
		System.out.println("dog is barking");
	}
}
public class InterfaceEx2 {

	public static void main(String[] args) 
	{
		dog obj=new dog();
		obj.bark();
	}

}
