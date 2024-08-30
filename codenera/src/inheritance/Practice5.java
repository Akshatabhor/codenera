package inheritance;
import java.util.Scanner;
class bankaccount
{
	int balance=10000;
	void deposite(int amt)
	{
		balance=balance+amt;
		System.out.println("total amt of deposite:"+balance);
	}
	void withdraw(int amt)
	{
		if(amt>balance)
		{
			System.out.println("balance is not sufficientcurrent balance:"+balance);
		}
		else
		{
			balance =balance-amt;
			System.out.println("withdraw successfullay:"+balance);
		}
	}
}
class savingaccount extends bankaccount
{
	void withdraw(int amt)
	{
		if(amt<100)
		{
			System.out.println("your balance is less than 100 you cannot withdraw amt");
		}
		else
		{
			super.withdraw(amt);
		}
	}
}
public class Practice5 {

	public static void main(String[] args)
	{
		savingaccount obj=new savingaccount();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the deposite amt:");
		int amt=sc.nextInt();
		obj.deposite(amt);
		System.out.println("enter the withdraw amt:");
		int amt1=sc.nextInt();
		obj.withdraw(amt1);
		
		
		
	}

}
