package String;
import java.util.Scanner;
public class ReplaceAlloccStringWithAnotherString {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		 System.out.println("Enter String:");
		 String str=s.nextLine();
		 String replaceString=str.replaceAll("a", "e");
		 System.out.println(" replace all string with another string:");
		 System.out.println(replaceString);
	}

}
