package Pattern;
/* 55555
 * 45555
 * 34555
 * 23455
 * 12345*/
public class NumberPattern26 {

	public static void main(String[] args) 
	{
		 int n=5;
		 for(int i=1;i<=n;i++)
		 {
			 int count=n-i+1;
			 for(int j=1;j<=n;j++)
			 {
				 if(j>i)
				 {
					 System.out.print("5 ");
				 }
				 else
				 {
					 System.out.print((count++)+" ");
				 }
			 }
			 System.out.println();
		 }

	}

}
