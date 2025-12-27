package collections;


import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQ_and_LinkedList 
{
	void meth1() 
	{
		//Queue Interface : offer()===>It will add Elements in Collection class
		//list Interface : add():===>It will add Elements in Collection class
		//from java 1.5v onwords LinkedList impliments both List and Queue properties
		
		List l=new LinkedList(); 
		l.add(l);
		//l.offer(2);  //C.E
		
		LinkedList li=new LinkedList(); 
		li.add(l);
		li.offer(2);
	}
	void meth2()
	{
		PriorityQueue pq=new PriorityQueue();
							
							//In PriorityQueue always the first element will be the smallest element
		pq.offer(10);		//Insertion order is NOT maintain
		//pq.add("java");	//it allows only homogeneous data
		//pq.add(null);	//Null is NOT allowed
		pq.add(85);		//Duplicates are allowed 
		pq.add(10);		//Default capacity =11
		pq.add(84);		//size increses by  [Double]
		pq.add(1);		
		pq.add(96);		//It is available from java 1.5v
		pq.add(100);	//It is not synchronize by default
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.peek());//without remove element
		System.out.println(pq);
		//pq.clear();
		//System.out.println(pq.poll());//null
		//System.out.println(pq.remove());//NoSuchElementException
		
		for(Object o : pq)
		{
			System.out.println(o);
		}
		
	}
	public static void main(String[] args) {
		PriorityQ_and_LinkedList pl=new PriorityQ_and_LinkedList();
		pl.meth1();
		pl.meth2();
	}

}
