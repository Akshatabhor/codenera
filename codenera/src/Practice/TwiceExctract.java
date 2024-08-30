/*Q9.Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n) time & constant extra space.

Example : 

Input:  arr[] = {2, 3, 5, 4, 5, 3, 4}
Output: 2 
*/

package Practice;

public class TwiceExctract {

	public static void main(String[] args)
	{
		int a[]= {2,3,5,4,5,3,4};
		System.out.println("Twice Occur Once");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}

}
