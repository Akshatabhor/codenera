package StringBuffer;
import java.util.Scanner;
public class BufferReplace {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		StringBuffer sb= new StringBuffer(sc.nextLine());
		System.out.println("String:"+sb);
		System.out.println("replace:"+sb.replace(0, 4 ,"html"));
		
	}

}
