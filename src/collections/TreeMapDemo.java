package collections;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapDemo {

	void meht1()
	{
		TreeMap tm=new TreeMap();
		
		//if we are giving a Duplicate key we will not getting any error
		//Old value associated with that key will be replace with new value
		
		tm.put(101, "java");	//Insertion order is NOT maintain
		tm.put(102, "python");	//Duplicates key are NOT allowed 
		//tm.put("java", 5000);	//Hetergeneous keys not  allowed
		tm.put(103, 2000);		//Hetergeneous values are allowed
		tm.put(4, null);		//NULL keys are not allow but NULL values are allowed
		tm.put(109, "java");	//It is available from java 1.2v
		System.out.println(tm);
		tm.put(103, "html");	//Default capacity =16
		//tm.put('A', "java");	//Load factor :0.75(after 13th element added then size will double 32)
		//tm.put(0.1, 000.1);	//It is not synchronize by default
		System.out.println(tm);
		
		
		
	}
	public static void main(String[] args) {
		TreeMapDemo tmd=new TreeMapDemo();
		tmd.meht1();
	}
}
