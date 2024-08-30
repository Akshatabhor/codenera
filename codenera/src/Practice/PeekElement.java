/*Q1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 

 Note: For corner elements, we need to consider only one neighbor. 

  Example:
 Input: array[]= {5, 10, 20, 15}
 Output: 20
*/

package Practice;

public class PeekElement {

	public static void main(String[] args)
	{
		int a[]= {5,10,20,15};
		System.out.println("Peek element");
		for(int i=0;i<a.length;i++)
		{
			if(i!=0 && i!=a.length-1)
			{
				if(a[i]>a[i-1] && a[i]>a[i+1])
				{
					System.out.println(a[i]+" ");
				}
			}
		}
	}

}
