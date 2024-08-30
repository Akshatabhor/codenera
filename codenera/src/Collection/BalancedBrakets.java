package Collection;
//Input: exp = “[()]{}{[()()]()}” 
//Output: Balanced
//Explanation: all the brackets are well-formed
//
//Input: exp = “[(])” 
//Output: Not Balanced 

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrakets
{
	static boolean isbracketbalanced(String str)
	{
		Deque<Character> stack = new ArrayDeque<Character>();
		for(int i = 0;i < str.length();i++)
		{
		char ch = str.charAt(i);
		if(ch == '(' || ch == '[' || ch == '{')
					
		{
			stack.push(ch);
			continue;
		}
		if(stack.isEmpty())
		{
			return false;
		}
		char c;
		switch (ch)
		{
			case ')':
				c = stack.pop();
				if(c == '{' || c == '[')
				{
					return false;
				}
				break;
			case '}':
				c = stack.pop();
				if(c == '(' || c == '[')
				{
					return false;
				}
				break;
			case ']':
				c = stack.pop();
				if(c == '(' || c == '{')
				{
					return false;
				}
				break;
		}
	}
	return (stack.isEmpty());
	}

	public static void main(String[] args) 
	{
		String str = "[()]{}{[()()]()}";
		
		if(isbracketbalanced(str))
		{
			System.out.println("is Balanced");
		}
		else
		{
			System.out.println("is not Balanced");
		}

	}

}