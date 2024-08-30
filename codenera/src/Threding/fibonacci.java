package Threding;

import java.util.Scanner;
class SecondaryThread extends Thread{
	int n;
	public SecondaryThread(int n) {
		this.n=n;
	}
	public void run() {
		  int a=0;
		   int b=1;
		   for(int i=0;i<n;i++) {
			  if(i>=n/2) {
				  System.out.print(a+" ");
			  }
			   int sum=a+b;
			   a=b;
			   b=sum;
		   }
		   System.out.println();
	}
}

public class fibonacci extends Thread {
	 int n;
   public fibonacci(int n) {
		this.n=n;
	}
   public void run() {
	   int a=0;
	   int b=1;
	   for(int i=0;i<n/2;i++) {
		   System.out.print(a+" ");
		   int sum=a+b;
		   a=b;
		   b=sum;
	   }
	   System.out.println();
	  
//	   try {
//		   s1.join();
//	   }catch (Exception e){
//		   System.out.println(e);
//	   }
   }

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENter a number :");
	int n=s.nextInt();
	fibonacci t1=new fibonacci(n);
	SecondaryThread s1=new SecondaryThread(n); 
	
	try {
		t1.start();
		s1.start();
		t1.join();
		s1.join();
	}catch (Exception e){
		   System.out.println(e);
	   }
	System.out.println("Main method completed !");
	
}
}