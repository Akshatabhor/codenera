package Pattern;

public class MixNumberAndx {
	
		public static void main(String[] args) {
	      for(int i=1;i<=7;i+=2) {
	    	  int temp=1;
	          for(int j=1;j<=i;j++) {
	        	  if(j==1 || i==j) {
	            	  System.out.print("*");  
	        	  }else {
	        		  if(j<=i/2) {
	                	  System.out.print(temp++ );  
	 
	        		  }else {
	                	  System.out.print(temp--);  
	        		  }
	        	  }
	          }
	    	  System.out.println();
	       }
	      for(int i=5;i>=1;i-=2) {
	    	  int temp=1;
	          for(int j=1;j<=i;j++) {
	        	  if(j==1 || i==j) {
	            	  System.out.print("*");  
	        	  }else {
	        		  if(j<=i/2) {
	                	  System.out.print(temp++);  
	 
	        		  }else {
	                	  System.out.print(temp--);  
	        		  }
	        	  }
	          }
	    	  System.out.println();
	       }
		}

	
}
