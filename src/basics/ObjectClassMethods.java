package basics;

public class ObjectClassMethods {
	
	
	public static void main(String[] args) 
	{
		ObjectClassMethods obj1=new ObjectClassMethods();
		ObjectClassMethods obj2=new ObjectClassMethods();
		
		//hashcode method is uniqe identification number
		System.out.println("hashcode method ===>" + obj1.hashCode());
		System.out.println("hashcode method ===>" + obj2.hashCode());
		System.out.println("------------------------------------------");
		
		//equals method has boolean value(true or false)object address location compare
		System.out.println("equals method ===>"+obj1.equals(obj1));
		System.out.println("equals method ===>"+obj1.equals(obj2));
		System.out.println("------------------------------------------");
		
		//getclass method return fully qulify name of our class
		System.out.println(obj1.getClass());
		System.out.println("------------------------------------------");
		
		//toString method convert object into string representing formate(hexa integer code)
		System.out.println(obj1.toString());
		System.out.println("------------------------------------------");
		
		/* finalize method: called by garbage collecter and destroy unused
		   and unreferance object.gc acting when any object eligible for distruction
		 */
		ObjectClassMethods obj3=new ObjectClassMethods();
		obj3.show();
		obj3=null;
		//obj3.show();
		System.gc();
	}
	void show() 
	{
		System.out.println("hello not for GC");
	}
	protected void finalize() {
		System.out.println("garbage has been collected");
	}

}
