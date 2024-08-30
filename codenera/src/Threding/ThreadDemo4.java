package Threding;

public class ThreadDemo4 extends Thread
{
	ThreadDemo4(String name)
	{
		super(name);
	}
	public void run()
	{
		System.out.println("Running....."+Thread.currentThread().getName());//it not disply in sequence
	}

	public static void main(String[] args)
	{
		ThreadDemo4 t1=new ThreadDemo4("Thread1");	
		ThreadDemo4 t2=new ThreadDemo4("Thread2");
		ThreadDemo4 t3=new ThreadDemo4("Thread3");
		
		
		//property between 1-10;
		t1.setPriority(MAX_PRIORITY);//by default maxproperty is 10
		t2.setPriority(MIN_PRIORITY);//by default minproperty is 1
		t3.setPriority(3);
		System.out.println("priority of Thread 1:"+ t1.getPriority());//by default getpriority is 5
		System.out.println("priority of Thread 2:"+ t2.getPriority());
		System.out.println("priority of Thread 3:"+ t3.getPriority());

		/*System.out.println("first thread:"+ t1.getName());
		System.out.println("second thread:"+ t2.getName());
		System.out.println("thread thread:"+ t3.getName());*/
		
		/*t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		System.out.println("first thread:" +t1.getName());
		System.out.println("second thread:" +t2.getName());
		System.out.println("thread thread:" +t3.getName());*/
		
		//System.out.println(Thread.currentThread().getName());//current thread method call to main
		
		/*t1.start();
		t2.start();
		t3.start();*/ 

	}

}
