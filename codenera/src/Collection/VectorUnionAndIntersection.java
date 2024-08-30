package Collection;

import java.util.Vector;

public class VectorUnionAndIntersection {

	public static void main(String[] args)
	{
		
		
				Vector <Integer> obj = new Vector();
				//System.out.println("Is vector empty: "+obj.isEmpty());
				obj.add(25);
				obj.add(65);
				obj.add(47);
				obj.add(98);
				obj.add(5);
				obj.add(77);
				Vector <Integer> obj1 = new Vector();
				obj1.add(11);
				obj1.add(65);
				obj1.add(13);
				obj1.add(25);
				obj1.add(77);
			
				
				System.out.println("Vector 1"+obj);
				System.out.println("Vector 2: "+obj1);
				
				System.out.println("Union of vector 1 and 2 : ");
				
				for(int i=0; i<obj.size(); i++)
				{
					for(int j=0; j<obj1.size(); j++)
					{
						if(obj.get(i).equals(obj1.get(j)))
						{
							System.out.print(obj.get(i)+" ");
						}
					}
				}
				
				for(int i=0; i<obj.size(); i++)
				{
					int c=0;
					for(int j=0; j<obj1.size(); j++)
					{
						if(obj.get(i).equals(obj1.get(j)))
						{
							c++;
						}
					}
					if(c==0)
					{
						System.out.print(obj.get(i)+" ");
					}
				}
				
				for(int i=0; i<obj1.size(); i++)
				{
					int c=0;
					for(int j=0; j<obj.size(); j++)
					{
						if(obj.get(j).equals(obj1.get(i)))
						{
							c++;
						}
					}
					if(c==0)
					{
						System.out.print(obj1.get(i)+" ");
					}
				}
		//	obj1.removeAll(obj);
			//	System.out.println("Union : "+obj1);
				//obj1.retainAll(obj);
				//System.out.println("Intersection of obj AND obj1: "+obj1);

			}

		
	}


