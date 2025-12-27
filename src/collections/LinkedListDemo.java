package collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo 
{
	void meth1() 
	{
		LinkedList ll=new LinkedList();
		ll.add(10);		//Insertion order is maintain
		ll.add("java");	//Duplicates are allowed
		ll.add(null);	//Null is allowed
		ll.add(85);		//Hetergeneous elements are allowed
		ll.add(10);		//Default capacity =0
		ll.add(84);		//size increses by  [Double]
		ll.add(14);		//It is available from java 1.2v  
		ll.add(96);		//It is not synchronize by default
		ll.add(100);	//Element or object will be stored in the form of NODE structure
		
		System.out.println(ll);
		
		ListIterator li=ll.listIterator();
		while(li.hasNext()) 	//forword direction order
		{
			System.out.print(li.next()+" ");
		}
		System.out.println("");
		while(li.hasPrevious()) //reverse direction order
		{
			System.out.print(li.previous()+" ");
		}
		System.out.println("");
		System.out.println("--------------------------");
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		ll.addFirst(7);
		ll.addLast(7);
		System.out.println(ll);
		
	}

	public static void main(String[] args) {
		LinkedListDemo lld=new LinkedListDemo();
		lld.meth1();
	}
}

//Linked occupies more memory than the array list
//so constuction time is more for linkedlist
