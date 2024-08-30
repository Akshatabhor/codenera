package String;
import java.util.Scanner;
public class MaxCharBetweenTwoString 
{

	
	    public static void main(String[] args) {
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter a String 1:");
	        String ans=s.nextLine();
	        int count=0;
	        for (int i = 0; i < ans.length(); i++) {
	            for (int j =i+1; j < ans.length(); j++) {
	                    if (ans.charAt(i)==ans.charAt(j)){
	                        int max=j-i-1;
	                        if(max>count){
	                            count=max;
	                        }
	                    }
	            }
	        }
	        System.out.println("The maximum number of char between two chars is :"+count);
	    }
	}

