/*1. Delete consecutive same words in a sequence

Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.

Input :  tom jerry jerry tom
Output : 0

As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy
each other. So, the final sequence doesn’t contain any
word.
*/

package Collection;

import java.util.Scanner;
import java.util.Stack;

public class StackDemo4 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=s.nextLine();
        String[] sa=str.split(" ");
        Stack<String>stack=new Stack<>();
        stack.push(sa[0]);
        for (int i = 1; i < sa.length; i++) 
        {
            if(stack.peek().equals(sa[i]))
            {
                stack.pop();
            }
            else 
            {
                stack.push(sa[i]);
            }
        }
        System.out.println("The ans is :"+stack.size());
        System.out.println("Stack:"+stack);
    }
}