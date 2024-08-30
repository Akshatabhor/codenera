package Threding;

import java.util.Random;

public class RandomNo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		Random random=new Random();
		System.out.println(random.nextInt(50));
	}

	public static void main(String[] args) throws InterruptedException
	{
		RandomNo obj=new RandomNo();
		obj.start();
		obj.join();
		RandomNo obj1=new RandomNo();
		obj1.start();
		obj1.join();
	}

}
