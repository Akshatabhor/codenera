package oops;

abstract class Animal1 
{
    protected String name;

    public Animal1(String name)
    {
        this.name = name;
    }

    public abstract void sound();

    public void displayName() 
    {
        System.out.println("Animal's name: " + name);
    }
}

interface Pet
{
    void play();
    void beFriendly();
}

class Dog1 extends Animal1 implements Pet
{

    public Dog1(String name)
    {
        super(name);
    }

    @Override
    public void sound()
    {
        System.out.println(name + " says: Woof Woof!");
    }

    @Override
    public void play() 
    {
        System.out.println(name + " is playing fetch.");
    }

    @Override
    public void beFriendly() 
    {
        System.out.println(name + " is wagging its tail.");
    }
}

class Cat1 extends Animal1 implements Pet 
{
    public Cat1(String name)
    {
        super(name);
    }

    @Override
    public void sound() 
    {
        System.out.println(name + " says: Meow Meow!");
    }

    @Override
    public void play() 
    {
        System.out.println(name + " is playing with a ball of yarn.");
    }

    @Override
    public void beFriendly()
    {
        System.out.println(name + " is purring.");
    }
}

public class Main6
{

	public static void main(String[] args) 
	{
		Animal1 ob = new Dog1("Chinnu");
        ob.displayName();
        ob.sound();

        Pet ob1 = (Pet) ob;
        ob1.play();
        ob1.beFriendly();

        System.out.println();

        Animal1 ob2 = new Cat1("Minnu");
        ob2.displayName();
        ob2.sound();

        Pet ob3 = (Pet) ob2;
        ob3.play();
        ob3.beFriendly();

	}

}