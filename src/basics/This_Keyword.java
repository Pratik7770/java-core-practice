package basics;

public class This_Keyword 
{
	int a=10;
	static int b=20;
	void meth1()
	{
	
		int a=40;
		System.out.println(this.a);
		System.out.println(a);
		System.out.println(This_Keyword.b);
		System.out.println(this.b);
		//it is used to call/acess present class variable and methods
		//cant used in stativ area
	}
	
	void meth2() 
	{
		System.out.println("meth2 called");
		this.meth3();
		//this keyword is used to call present class methods
		
		
	}
	void meth3() 
	{
		System.out.println("meth 3");
		
	}
	
	//this keyword is used to return the instance of present class
	
	This_Keyword meth4()
	{
		System.out.println("meth4");
		return this;
	}
	This_Keyword meth5()
	{
		System.out.println("meth5");
		return this;
	}
	
	//this() method
	// its a constructor call
	//used to call present class constructor
	//this() only used in constructor [only first statement]
	
	This_Keyword ()
	{
		this(10);
		System.out.println("consrtuctor");
	}
	This_Keyword (int a)
	{
		
		System.out.println(a);

	}
	
	public static void main(String[] args) {
		This_Keyword obj=new This_Keyword ();
		obj.meth1();
		obj.meth4().meth5().meth1();;    //method chaining
	}

}
