package StringBuffer;

public class BufferCapacity {

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		System.out.println("Default capacity sb:"+sb.capacity());
		sb.append("java");
		System.out.println("default capacity sb apend:"+sb.capacity());//when we append the default value is not change
		
		StringBuffer sb1=new StringBuffer("javaprogramming:");
		System.out.println("default capacity of sb1:"+sb1.capacity());
		sb1.ensureCapacity(19);
		System.out.println("ensure capacity:"+sb1.capacity());
		sb1.ensureCapacity(35);
		System.out.println("ensure capacity 1: "+sb1.capacity());/*old capacity*2+2*/
		
	}

}
