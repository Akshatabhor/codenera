package String;
import java.util.Scanner;
public class removefirstoccuranceword {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Srting 1:");
		String s1=sc.nextLine();
		System.out.println("Enter String 2:");
		String s2= sc.nextLine();
		
		if(s1.contains(s2))
		{
		String s3=s1.replaceFirst(s2, "");
		System.out.println(s3);
		}
		else
		{
			System.out.println("Invalid Input: string 2 not present in string 1 ");
		}



	}

}
