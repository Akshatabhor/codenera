package Collection;

import java.util.Arrays;

public class StreamAPIWordCounter
{
	public static long countword(String s1)
	{
		return Arrays.stream(s1.split("\\s+")).filter(word -> !word.isEmpty()).count();
	}

	public static void main(String[] args)
	{
		String s1="java is a simple programming lamguage";
		long wordcount =countword(s1);
		System.out.println("word count:"+wordcount);
	}

}
