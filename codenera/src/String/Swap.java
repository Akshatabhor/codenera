/*Special array reversal 
 Example 1:
 Input: S = "A&B"
 Output: "B&A"
 Explanation: As we ignore '&' and
 then reverse, so answer is "B&A".
 Example 2:
 Input: S = "A&x#
 Output: "x&A#"
 Explanation: we swap only A and x.*/

package String;
import java.util.Scanner;
public class Swap 
{
	public static void revAlphabet(String str)
	{
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				sb.append(str.charAt(i));
			}
		}
		sb.reverse();
		System.out.println(sb);
		
		int j=0;
		for(int i=0;i<sb1.length();i++)
		{
			if(Character.isAlphabetic(sb1.charAt(i)))
			{
				sb1.setCharAt(i, sb.charAt(j));
				j++;
			}
		}
		System.out.println("reverse string"+sb1);
		
	}
	public static void main(String[] args) 
	{
		String str="A&B#C";
		Swap.revAlphabet(str);
		
	}

}
