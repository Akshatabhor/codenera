package Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class usingListCheckPallindromeNo 
{

	public static void main(String[] args) 
	{
		LinkedList l= new LinkedList();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		System.out.println("Enter elements into LikedList: ");
		for(int i=0; i<size; i++)
		{
			l.add(sc.nextInt());
		}
		
		int c=0;
		for(int i=0; i<l.size()/2; i++)
		{
			if(l.get(i)!=l.get(l.size()-1-i))
			{
				c=1;
				break;
			}
			
		}
		System.out.println(c==0 ? "Given Linked list is Pallindromic" : "Given Linked List is not Pallidromic");
	}

}