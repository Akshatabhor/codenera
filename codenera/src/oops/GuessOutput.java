package oops;
class Test1
{ 
	int x = 10; 
}	
public class GuessOutput 
{
	public static void main(String[] args) 
		{ 
			Test1 t1 = new Test1(); 
			Test1 t2 = new Test1(); 
			t1.x = 20; 
			System.out.print(t1.x + " "); 
			System.out.println(t2.x); 
		} 
	} 



