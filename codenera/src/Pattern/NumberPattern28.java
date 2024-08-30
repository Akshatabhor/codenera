package Pattern;
/* 1
 * 2 4
 * 3 6 9
 * 4 8 12 16
 * 5 10 15
 * 6 12
 * 7
 * */
/*
1
2 4
3 6 9
4 8 12 16
5 10 15
6 12
7
*/



public class NumberPattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for(int i=1; i<=n; i++)
		{
			int k=i;
			
			if(i<=4)
			{
				
				for(int j=1; j<=i; j++)
				{
					System.out.print(k+" ");
					k=k+i;
				}
			}
			if(i>4)
			{
				for(int j =i; j<=n; j++)
				{
					System.out.print(k+" ");
					k=k+i;
				}
			}
			
			System.out.println();
		}
		
		
		
	}

}