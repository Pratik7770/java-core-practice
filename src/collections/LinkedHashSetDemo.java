
package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo
{
	void meth1() 
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(10);		//Insertion order is maintain
		lhs.add("java");	//Duplicates are NOT allowed
		lhs.add(null);	//Null is allowed
		lhs.add(85);		//Hetergeneous elements are allowed
		lhs.add(10);		//Default capacity =16
		lhs.add(84);		//size increses by  [Double]
		lhs.add(14);		//Load factor :0.75(after 13th element added then size will double 32) 
		lhs.add(96);		//It is available from java 1.4v
		lhs.add(100);	//It is not synchronize by default
		System.out.println(lhs);
		System.out.println("Retriving data using Iterator Interface");
		Iterator i=lhs.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
public static void main(String[] args) {
	LinkedHashSetDemo lhs=new LinkedHashSetDemo();
	lhs.meth1();
}
}
