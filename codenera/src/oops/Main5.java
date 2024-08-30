package oops;

class Vehicle 
{

    public void start()
    {
        System.out.println("Vehicle is starting");
    }

    public void stop()
    {
        System.out.println("Vehicle is stopping");
    }
}

class Car extends Vehicle
{
    @Override
    public void start()
    {
        System.out.println("Car start with ignition");
    }

    @Override
    public void stop()
    {
        System.out.println("Car stop with brakes");
    }
}

class Bike extends Vehicle 
{
    @Override
    public void start()
    {
        System.out.println("Bike start with kick");
    }

    @Override
    public void stop()
    {
        System.out.println("Bike stop with hand brake");
    }
}
public class Main5 
{

	public static void main(String[] args) 
	{
		Vehicle myVehicle = new Car();
        myVehicle.start(); 
        myVehicle.stop();

        System.out.println();

        myVehicle = new Bike();
        myVehicle.start(); 
        myVehicle.stop(); 

	}

}