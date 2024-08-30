/*1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
Note: For corner elements, we need to consider only one neighbor. 
 Example:
 Input: array[]= {5, 10, 20, 15}
 Output: 20
 Find a peak element which is not smaller than its neighbours
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, similarly 90 has neighbors 23 and 67.
*/

package RevisionPractice;

public class PeakElement {

	public static void main(String[] args) 
	{
		int a[]= {5,10,20,15};
		/*if(a[0]>a[1])for corner element
		{
			System.out.println(a[0]);
		}*/
		System.out.println("Peek Element");
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				System.out.println(a[i]);
			}
		}
		/*if(a[a.length-1]>a[a.length-2])
		{
			System.out.println(a[a.length-1]);
		}*/
	}

}
