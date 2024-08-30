package Collection;


import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter elements in liked list:");
		LinkedList <Integer>obj = new LinkedList();
		for(int i=0; i<size; i++)
		{
			obj.add(sc.nextInt());
		}
		
		Set sobj= new HashSet(obj);
		
		LinkedList obj1=new LinkedList(sobj);
		System.out.println("Output: "+obj1);
	}

}