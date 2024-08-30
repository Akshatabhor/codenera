package StringBuffer;

public class BufferDeleteCharAt {

	public static void main(String[] args)
	{
		String str="java";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("String 1:"+str);
		sb.deleteCharAt(1);
		System.out.println("delete string:"+sb);
	}

}
