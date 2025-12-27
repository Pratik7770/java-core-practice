package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo 
{
	void meth1()
	{
		TreeSet ts=new TreeSet(); //USES BALANCE BINARY SEARCH TREE ALGORITHM
		ts.add(10);		//Insertion order is NOT maintain(sorting order ascending order is maintain)
		//ts.add("java");	//Hetergeneous elements are NOT allowed
		//ts.add(null);	//Null is NOT allowed
		ts.add(85);		//Duplicates are NOT allowed 
		ts.add(10);		//Default capacity =16
		ts.add(84);		//size increses by  [Double]
		ts.add(14);		//Load factor :0.75
		ts.add(96);		//It is available from java 1.2v
		ts.add(100);	//It is not synchronize by default
		System.out.println(ts);
		System.out.println("Retriving data using Iterator Interface");
		Iterator i=ts.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}
		System.out.println("Retriving data using Iterator Interface(descending order)");
		Iterator i2=ts.descendingIterator();
		while(i2.hasNext()) 
		{
			System.out.println(i2.next());
		}
		System.out.println(ts.headSet(84));
		System.out.println(ts.tailSet(85));
	}
	public static void main(String[] args) {
		TreeSetDemo tsd=new TreeSetDemo();
		tsd.meth1();
	}

}
