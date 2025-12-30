package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashMapDemo 
{
	void meht1()
	{
		LinkedHashMap lhm=new LinkedHashMap();
		
		//if we are giving a Duplicate key we will not getting any error
		//Old value associated with that key will be replace with new value
		
		
		lhm.put(101, "java");	//Insertion order is  maintain
		lhm.put(102, "python");	//Duplicates key are NOT allowed 
		lhm.put("java", 5000);	//Hetergeneous keys are allowed
		lhm.put(103, 2000);		//Hetergeneous values are also allowed
		lhm.put(null, null);		//NULL keys and values are allowed
		lhm.put(109, "java");	//It is available from java 1.2v
		System.out.println(lhm);
		lhm.put(103, "html");	//Default capacity =16
		lhm.put('A', "java");	//Load factor :0.75(after 13th element added then size will double 32)
		lhm.put(0.1, 000.1);	//It is not synchronize by default
		System.out.println(lhm);
		
		
		//Retriving the data from map Implementation Classes
		LinkedHashSet lhs1=new LinkedHashSet(lhm.keySet());	//only keys acting element for hashset
		System.out.println(lhs1);
		System.out.println("==============================");
		LinkedHashSet lhs2=new LinkedHashSet(lhm.entrySet());	//entrySet() return all entries(key value pair)
		System.out.println(lhs2);
		Iterator i=lhs2.iterator();
		while(i.hasNext()) 
		{ 
			System.out.println(i.next());
		}
		
		
	}
	public static void main(String[] args) {
		LinkedHashMapDemo lhmd=new LinkedHashMapDemo();
		lhmd.meht1();
	}

}
