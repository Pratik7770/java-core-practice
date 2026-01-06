package basics;

public class Stattic_Keyword {
	
	static int a;		//0				//static variable
	int b;				//0				//instance variable
	
	void meth1()
	{
		a++;
		System.out.println("stativ variable");
		System.out.println(a);
		System.out.println("instance variable");
		//b++;
		System.out.println(b);
	}
	Stattic_Keyword()
	{
		a++;
		b++;
		System.out.println(a);
		System.out.println(b);
	}
	
	static void meth2() {								//static method
		System.out.println("static meth called");
		
	}
	static {											//static block
		System.out.println("static block called");
	}
	
	public static void main(String[] args)
	{
		//new Stattic_Keyword().meth1();
		Stattic_Keyword obj=new Stattic_Keyword();
		obj.meth2();    								//call through object ref
		meth2();										//call through meth name
		Stattic_Keyword.meth2(); 						// by class name
		
		//variable call by 3 method
		System.out.println(Stattic_Keyword.a);
		System.out.println(a);
		System.out.println(obj.a);
	}

}

