package String;
import java.util.Scanner;
public class CountDigit {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		int cnt = 0;
		for(int i = 0;i < str.length();i++)
		{
			if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
			{
				cnt++;
			}
		}
		System.out.println("count the number of digit:"+cnt);

	}

}
