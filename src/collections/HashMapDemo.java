package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemo 
{
	void meht1()
	{
		HashMap hm=new HashMap();
		
		//if we are giving a Duplicate key we will not getting any error
		//Old value associated with that key will be replace with new value
		
		
		hm.put(101, "java");	//Insertion order is NOT maintain
		hm.put(102, "python");	//Duplicates key are NOT allowed 
		hm.put("java", 5000);	//Hetergeneous keys are allowed
		hm.put(103, 2000);		//Hetergeneous values are also allowed
		hm.put(null, null);		//NULL keys and values are allowed
		hm.put(109, "java");	//It is available from java 1.2v
		System.out.println(hm);
		hm.put(103, "html");	//Default capacity =16
		hm.put('A', "java");	//Load factor :0.75(after 13th element added then size will double 32)
		hm.put(0.1, 000.1);	//It is not synchronize by default
		System.out.println(hm);
		
		
		//Retriving the data from map Implementation Classes
		HashSet hs1=new HashSet(hm.keySet());	//only keys acting element for hashset
		System.out.println(hs1);
		System.out.println("==============================");
		HashSet hs2=new HashSet(hm.entrySet());	//entrySet() return all entries(key value pair)
		System.out.println(hs2);
		Iterator i=hs2.iterator();
		while(i.hasNext()) 
		{ 
			System.out.println(i.next());
		//Entry e=(Entry)i.next();
		//System.out.println(e.getkey()+" "+e.getvalue());
		}
	}
	public static void main(String[] args) {
		HashMapDemo hsd=new HashMapDemo();
		hsd.meht1();
	}
}
