package String;

public class EasyString1 {

	public static void main(String[] args) 
	{
		String s="aaABBb";
		StringBuilder sb=new StringBuilder();
		String a=s.toLowerCase();
		
		for(int i=0;i<a.length();i++)
		{
			int c=1;
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					c++;
					i++;
				}
				else
				{
					break;
				}
			}
			sb.append(c).append(a.charAt(i));
		}
		System.out.println(sb);
	}

}
