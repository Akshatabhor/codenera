/*Write a Java program that reads a array of integers
 
 from the user and throws an exception if any numbers are duplicates.
*/

package ExceptionHandling;
class duplicateException extends Exception
{
	duplicateException(String msg)
	{
		super(msg);
	}
}
public class CustomThrows4 
{
	public void dublicate() throws duplicateException
	{
		int a[]= {1,1,2,3,4};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{	
					throw new duplicateException("duplicate element:"+a[i]);
				}
				else
				{
					System.out.println("no duplicate element");
				}
			}
		}
		

	}
	public static void main(String[] args) 
	{
		CustomThrows4 obj=new CustomThrows4();
		try
		{
			obj.dublicate();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
