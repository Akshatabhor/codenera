package String;

public class reverseusingloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello all";
		char c[]=str.toCharArray();
		System.out.println("reverse String:");
		int last=c.length-1;
		for(int i=0;i<c.length/2;i++)
		{
			char t=c[i];
			c[i]=c[last];
			c[last]=t;
			last--;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	}

}
