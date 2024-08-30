/*Given an expression string exp,
 
write a program to examine whether the pairs and 
the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression.

Example: 

Input: exp = “[()]{}{[()()]()}” 
Output: Balanced
Explanation: all the brackets are well-formed

Input: exp = “[(])” 
Output: Not Balanced 
Explanation: 1 and 4 brackets are not balanced because 
there is a closing ‘]’ before the closing ‘(‘*/

package Collection;
import java.util.Stack;
public class StackDemo3 
{
	public static boolean isBal(String str)
	{
		Stack<Character> st=new Stack();
		char c[]=str.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='(' || c[i]=='{' || c[i]=='[')
			{
				st.push(c[i]);
			}
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				else
				{
					char top =st.pop();
					if((c[i] == ')' && top != '(') || (c[i] == '}' && top != '{') || c[i] == ']' && top != '[')

					{
						return false;
					}
				}
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String str1= "[()]{}{[()()]()}";
		String str2="[(])";
		if(StackDemo3.isBal(str1))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("UnBalance");
		}
	}

}
