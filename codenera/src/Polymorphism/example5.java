package Polymorphism;
class sport
{
	public void play()
	{
		System.out.println("playing games");
	}
}
class football extends sport
{
	public void play()
	{
		System.out.println("playing football");
	}
}
class basketball extends sport
{
	public void play()
	{
		System.out.println("playing basketball");
	}
}
public class example5 {

	public static void main(String[] args)
	{
		sport obj=new sport();
		obj.play();
		sport obj1=new football();
		obj1.play();
		sport obj2=new basketball();
		obj2.play();
	}

}
