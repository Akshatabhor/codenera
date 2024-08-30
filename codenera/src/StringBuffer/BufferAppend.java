package StringBuffer;

public class BufferAppend {

	public static void main(String[] args)
	{
		String str="java";
		StringBuffer sb=new StringBuffer(str);
		System.out.println("String1:"+str);
		sb.append("programming");
		System.out.println("after appending:"+sb);
		
	}

}
