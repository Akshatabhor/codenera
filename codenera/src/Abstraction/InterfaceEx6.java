/*Write a Java program to create an interface Playable with a method play() that
 *  takes no arguments and returns void. Create three classes Football, Volleyball, 
 *  and Basketball that implement the Playable interface and override the play() method 
 * to play the respective sports.
 */
package Abstraction;
interface playable
{
	void play();
}
class football implements playable
{
	public void play()
	{
		System.out.println("ram playing football");
	}
}
class volleyball implements playable
{
	public void play()
	{
		System.out.println("radha playing volleyball");
	}
}
class basketball implements playable
{
	public void play()
	{
		System.out.println("gaurav playing basketball");
	}
}
public class InterfaceEx6 {

	public static void main(String[] args) 
	{
		playable obj=new football();
		playable obj1=new volleyball();
		playable obj2=new basketball();
		obj.play();
		obj1.play();
		obj2.play();
		
		
	}

}
