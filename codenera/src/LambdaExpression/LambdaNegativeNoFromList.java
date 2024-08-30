/*Create a lambda function to filter out all the negative 
 * numbers from a list.
*/

package LambdaExpression;

import java.util.ArrayList;
interface demo11
{
	public void disp();
}
public class LambdaNegativeNoFromList 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> ob=new ArrayList<>();
		ob.add(10);
		ob.add(-2);
		ob.add(5);
		ob.add(-15);
		ob.add(32);
		System.out.println("given ArrayList:"+ob);
		
		ob.removeIf(n -> n < 0);

        // Print the updated ArrayList
        System.out.println("ArrayList after removing negative numbers: " + ob);
		
	}

}
