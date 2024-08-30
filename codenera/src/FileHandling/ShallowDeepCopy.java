package FileHandling;
class ex1
{
	int x=10;
}
public class ShallowDeepCopy 
{

	public static void main(String[] args) 
	{
		
		
		// shallow copy
				
//				Ex1 obj =new Ex1();
//				
//				Ex1 obj2 = obj;
//				
//				obj2.x = 30;
//				System.out.println(obj.x);//  10
//				
//				System.out.println(obj2.x);// 30
				
				// Deep copy 
				
				ex1 obj3 = new ex1();
				ex1 obj4 = new ex1();
				
				obj4.x = 6;
				obj3.x = 6;
				System.out.println(obj3.x);
		
	}

}
