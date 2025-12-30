package collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo
{
	void meth1() 
	{
		Hashtable h=new Hashtable();
		
		//if we are giving a Duplicate key we will not getting any error
		//Old value associated with that key will be replace with new value
		
		h.put(101, "java");		//Insertion order is NOT maintain
		h.put(102, "python");	//Duplicates key are NOT allowed 
		h.put("java", 5000);	//Hetergeneous keys are  allowed
		h.put(103, 2000);		//Hetergeneous values are allowed
		//h.put(null, null);		//NULL keys are not allow and NULL values are also not allowed
		h.put(109, "java");		//It is available from java 1.0v
		System.out.println(h);
		h.put(103, "hhl");		//Default capacity =11
		//h.put('A', "java");	//Load factor :0.75(after 9th element added then size will double 32)
		//h.put(0.1, 000.1);	//It is synchronize by default
		System.out.println(h);
		
		Enumeration e=h.elements();
		while(e.hasMoreElements()) 
		{
			System.out.println(e.nextElement());
		}
		System.out.println(h.keySet());
		System.out.println(h.values());
		
	}
	public static void main(String[] args) 
	{
		HashtableDemo hd=new HashtableDemo();
		hd.meth1();
	}
}
