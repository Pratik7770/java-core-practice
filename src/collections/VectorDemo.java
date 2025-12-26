package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo 
{
	void meth1() 
	{
		Vector v=new Vector();
		v.add(10);		//Insertion order is maintain
		v.add("java");	//Duplicates are allowed
		v.add(null);	//Null is allowed
		v.add(85);		//Hetergeneous elemets are allowed
		v.add(10);		//Default capacity =10
		v.add(84);		//New Capacity=(current capacity*2) [Double]
		v.add(14);		//It is available from java 1.0v  [Legacy class]
		v.add(96);		////It is synchronize by default
		v.add(100);
		v.add(50);
		System.out.println(v);
		
System.out.println("--------------------------");
		
		System.out.println("Retriving data using for loop");
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.elementAt(i));
		}
		System.out.println("--------------------------");
		
		System.out.println("Retriving data using for each loop");
		for(Object o : v)
		{
			System.out.println(o);
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Retriving data using Iterator Interface");
		Iterator i=v.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Retriving data using Enumeration Interface"); 
		Enumeration e=v.elements();
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
		
		v.addElement(5000);
		System.out.println(v);
		
		v.remove(v.size()-1);
		v.removeElement(10);
		System.out.println(v);
		
		System.out.println(v.lastElement());
		System.out.println(v.firstElement());
	}
	public static void main(String[] args) 
	{
		VectorDemo vd=new VectorDemo();
		vd.meth1();
		
	}
	

}
