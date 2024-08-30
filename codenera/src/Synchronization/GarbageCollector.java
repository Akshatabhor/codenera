package Synchronization;

public class GarbageCollector
{
	public void finalize()
	{
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args)
	{
		System.out.println("garbage collector demo");
		//GarbageCollector t1=new GarbageCollector();
		//GarbageCollector t2=new GarbageCollector();
		//t1=t2;//reference to another object
		//t1=null;//null reference
		
		new GarbageCollector();//anonymous object
		System.gc();
	}

}
