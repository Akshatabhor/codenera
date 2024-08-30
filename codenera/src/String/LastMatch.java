package String;

public class LastMatch {


	    public static void main(String[] args) {
	        String A = "abcdefghijklghifghsd";
	        String B = "ghi";
	        int lastIndex = lastIndexOf(A, B);
	        System.out.println(lastIndex);
	    }

	    public static int lastIndexOf(String A, String B) {
	        int lastIndex = -1;
	        int index = A.indexOf(B);
	        while (index != -1) {
	            lastIndex = index + 1;  
	            index = A.indexOf(B, index + 1);
	        }
	        return lastIndex;
	    }
	}


