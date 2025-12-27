package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Construction_Time 
{
	private static Object arr[];
	
	static
	{
		arr=new Object[100000];
		for(int i=0;i<arr.length;i++)
			arr[i]=new Object();
	}
	
	
	void ArryListTime() 
	{
		long start , end ;
		ArrayList al=new ArrayList();	
		start=System.currentTimeMillis();
		for(Object o1:arr)
		{
			al.add(o1);
		}
		end=System.currentTimeMillis();
		System.out.println("ArrayList Contruction time :"+(end-start));			
	}
	
	void LinkedListTime() 
	{
		long start , end ;
		LinkedList ll=new LinkedList();	
		start=System.currentTimeMillis();
		for(Object o1:arr)
		{
			ll.add(o1);
		}
		end=System.currentTimeMillis();
		System.out.println("LinkedList Contruction time :"+(end-start));			
	}
	
	public static void main(String[] args) 
	{
		Construction_Time ct=new Construction_Time();
		ct.ArryListTime();
		ct.LinkedListTime();
		
	}


}
