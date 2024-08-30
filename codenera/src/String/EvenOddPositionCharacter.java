package String;
import java.util.Scanner;
public class EvenOddPositionCharacter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char c[] = str.toCharArray();
		System.out.println("Print Even Number of Character");
		for(int i = 1;i < str.length();i=i+2)
		{
			System.out.println(c[i]);
		}
		System.out.println("Print Odd Number of Character");
		for(int i = 0;i < str.length();i=i+2)
		{
			System.out.println(c[i]);
		}


	}

}
