package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo
{
	void meth1() 
	{
		
		ArrayList al=new ArrayList();	//<Integer> generics is used for type casting introduce in java 1.5v
		al.add(10);    	//Insertion order is maintain
		al.add("java");	//Duplicates are allowed
		al.add(null);	//Null is allowed
		al.add('A'+1);	//Hetergeneous elemets are allowed
		al.add(10);		//Default capacity =10
		al.add(true);	//New Capacity=(current capacity*3/2) [Half]
		al.add(33);		//It is available from java 1.2v
		al.add(77);		//It is not synchronize by default
		al.add('b');
		
		System.out.println(al);
		
		System.out.println("size()==>"+al.size());//9
		System.out.println("isEmpty()==>"+al.isEmpty());//false
		//al.clear();		//It will remove all data in the array list
		//System.out.println("isEmpty()==>"+al.isEmpty());//true
		System.out.println("contains()==>"+al.contains("java"));//true
		System.out.println("remove()==>"+al.remove(8)); // remove by index
		System.out.println("remove()==>"+al.remove((Object) 77)); //remove by object
		System.out.println(al);
		
		al.add(2,"pratik");
		System.out.println(al);
		
		System.out.println(al.get(1));//get index no.data
		System.out.println("--------------------------");
		
		System.out.println("Retriving data using for loop");
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("--------------------------");
		
		System.out.println("Retriving data using for each loop");
		for(Object o : al)
		{
			System.out.println(o);
		}
		
		System.out.println("--------------------------");
		
		System.out.println("Retriving data using Iterator Interface");
		Iterator i=al.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
	}
	public static void main(String[] args) 
	{
		ArrayListDemo obj1=new ArrayListDemo();
		
		obj1.meth1();
	}

}
