package String;

public class DifficultSentence1 
{

	public static void main(String[] args) 
	{
		String str="difficulty of sentence";
		String s[]=str.split(" ");
		int cnthard=0;
		int cnteasy=0;
		for(int i=0;i<s.length;i++)
		{
			int vowel=0, con=0, concon=0;
			for(int j=0;j<s[i].length();j++)
			{
				char ch=s[i].charAt(j);
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					vowel++;
					if(concon>=4)
					{
						break;
					}
					concon=0;
					
				}
				else
				{
					con++;
					concon++;
				}
				
			}
			if(con>vowel || concon>=4)
			{
				cnthard++;
			}
			else
			{
				cnteasy++;
			}
		}
		System.out.println(5*(cnthard) + 3*(cnteasy));
	}

}
