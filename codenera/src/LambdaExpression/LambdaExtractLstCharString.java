/*Write a lambda function to extract the last character of a string.
*/

package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface demo9
{
	public void disp();
}
public class LambdaExtractLstCharString 
{

	public static void main(String[] args) 
	{
		demo9 ob=() ->{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String");
			String str=sc.nextLine();
			int n=str.length();
			char last=str.charAt(n-1);
			System.out.println("last Character of String:"+last);
			
		};
		ob.disp();
	}

}
