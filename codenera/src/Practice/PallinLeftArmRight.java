package Practice;
import java.util.Scanner;
public class PallinLeftArmRight
{
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter array size : ");
	        int size = sc.nextInt();
	        
	        int a[]=new int[size];

	        System.out.println("Enter array elements : ");
	        for(int i=0; i<a.length; i++)
	        {
	            a[i] = sc.nextInt();
	        }

	        System.out.println("Pallindrome in left and Armstrong in right : ");
	        
	        for(int i = 0; i < a.length; i++){
	            int rem = 0,
	                rev = 0;
	                for(int j=a[i]; j != 0; j=j/10){
	                    rem = j%10;
	                    rev = (rev*10)+rem;
	                }
	                if(a[i] == rev){
	            		for(int k=0;k<a.length;k++)
	            		{
	            			int rem1=0,sum=0;
	            			for(int j=a[k];j!=0;j=j/10)
	            			{
	            				rem1=j%10;
	            				sum=sum+(rem1*rem1*rem1);
	            			}
	            			if(sum==a[k])
	            			{
		                        int t = a[i];
		                        a[i] = a[k];
		                        a[k] = t;
		                        break;
	            			}
	            		}
	                }
	        }
	        
	        
	        for(int i=0; i<a.length; i++)
	        {
	            System.out.print(a[i]+" ");
	        }
	        System.out.println();
	    }
}