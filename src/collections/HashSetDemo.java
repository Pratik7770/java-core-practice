package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
	void meth1() 
	{
		HashSet hs=new HashSet();
		hs.add(10);		//Insertion order is NOT maintain
		hs.add("java");	//Duplicates are NOT allowed
		hs.add(null);	//Null is allowed
		hs.add(85);		//Hetergeneous elements are allowed
		hs.add(10);		//Default capacity =16
		hs.add(84);		//size increses by  [Double]
		hs.add(14);		//Load factor :0.75(after 13th element added then size will double 32) 
		hs.add(96);		//It is available from java 1.2v
		hs.add(100);	//It is not synchronize by default
		System.out.println(hs);
		System.out.println("Retriving data using Iterator Interface");
		Iterator i=hs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
public static void main(String[] args) {
	HashSetDemo hs=new HashSetDemo();
	hs.meth1();
}
}
