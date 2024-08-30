package String;
import java.util.Scanner;
public class removechar {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string: ");
		String s=sc.nextLine();
		System.out.println("Enter word to delete from string:");
		String s1=sc.next();
		
		if(s.contains(s1))
		{
		String s2=s.replaceAll( s1 , "");
		System.out.println(s2);
		}
		else
		{
			System.out.println("Invalid Input: entered string not present in original string");
		}


	}

}
