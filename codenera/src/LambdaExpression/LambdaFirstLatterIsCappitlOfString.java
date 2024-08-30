/*Write a lambda expression to capitalize the first letter of a string.
*/

package LambdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface demo12
{
	public void disp();
}
public class LambdaFirstLatterIsCappitlOfString 
{

	public static void main(String[] args) 
	{
		demo12 ob=()->{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the String");
			String str=sc.nextLine();
			String s[]=str.split(" ");
			
			for(int i=0;i<s.length;i++)
			{
				char s1=s[i].charAt(0);
				char capitalchar =Character.toUpperCase(s1);
				String capitalword=capitalchar+s[i].substring(1);
				System.out.println(capitalword);
				
			}
			
			
		};
		ob.disp();
	}

}
