package String;

public class WordLargestDictonary 
{

	public static void main(String[] args) 
	{
		String d[]= {"ale","apple","monkey","plea"};
		String s="abpcplea";
		StringBuffer sbmax=new StringBuffer();
		for(int i=0;i<d.length;i++)
		{
			StringBuffer sb=new StringBuffer();
			for(int j=0;j<d[i].length();j++)
			{
				for(int k=0;k<s.length();k++)
				{
					if(d[i].charAt(j)== s.charAt(k))
					{
						sb.append(s.charAt(k));
						break;
					}
				}
			}
			if(sb.length()>sbmax.length())
			{
				sbmax=sb;
			}
		}
		System.out.println(sbmax);
	}

}
