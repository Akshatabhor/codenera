package StringRevisionPackage;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalanceParaenthesis {
	
	static boolean isbalanceParenthesis(String str)
	{
		Deque <Character> stack=new ArrayDeque<Character>();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='(' || ch=='{' || ch=='[')
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
				c=stack.pop();
				if(c=='{' || c=='[')
				{
					return false;
				}
				break;
				
			case '}':
				c=stack.pop();
				if(c=='(' || c=='[')
				{
					return false;
				}
				break;
				
			case ']':
				c=stack.pop();
				if(c=='{' || c=='(')
				{
					return false;
				}
				break;
			}
		}
		return stack.isEmpty();
		
	}

	public static void main(String[] args)
	{
		String str="[()]{}{[()()]()}";
		
		if(isbalanceParenthesis(str))
		{
			System.out.println("is Balanced ");
		}
		else
		{
			System.out.println("not Balanced");
		}
		
	}

}
