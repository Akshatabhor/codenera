package Synchronization;

class booking12
{
	static int amount=5000;
	public static void deposite(int amt)
	{
		
		amount=amount+amt;
		System.out.println("amount deposited succesfully.....\ntotal balance:"+amount);
	
	}
	public static void withdraw(int amt)
	{
		if(amount<amt)
		{
			System.out.println("there is sufficient balance in your account");
		}
		else
		{
			amount=amount-amt;
			System.out.println("amount withdraw succesfully....\ntotal balance:"+amount);
		}
	}

}
public class BankAccount extends Thread
{
	int amt;
	BankAccount(int amt)
	{
		this.amt=amt;
	}
	public void run()
	{
		booking12.deposite(amt);
		booking12.withdraw(amt);
	}
	
	
	public static void main(String[] args) throws InterruptedException
	{
		BankAccount t1=new BankAccount(1000);
		BankAccount t2=new BankAccount(500);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("main completed");
		
		
	}
}
