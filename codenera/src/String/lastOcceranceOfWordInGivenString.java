package String;
import java.util.Scanner;
public class lastOcceranceOfWordInGivenString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter String:");
		String str=s.nextLine();
		 String[] str1=str.split(" ");
		 System.out.println("-->"+str1[str1.length-1]);

	}

}
