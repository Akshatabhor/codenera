package StringBuffer;

public class BufferDelete {

	public static void main(String[] args)
	{
		String str="javaprogramming";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("String 1:"+str);
		System.out.println("substring "+sb.substring(1, 3));
		sb.delete(1, 4);
		System.out.println("delete string:"+sb);
		
	}

}
