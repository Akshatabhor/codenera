package Threding;

public class MultiTasking1 extends Thread
{
	public void run() 
	{
		for(int i=1;i<5;i++)
		{
			System.out.println(i);
		}
	}
	

	public static void main(String[] args) 
	{
		MultiTasking1 t1=new MultiTasking1();
		t1.start();
	}

}
