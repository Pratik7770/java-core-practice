package basics;

public class Variables {
	
	int a=10;           //Global Variable (instance)
	static int b=5;     //static variable
	void meth1()
	{
		int c=1;		//local variable
		System.out.println("Global variable==>"+a);//by using identifier
		System.out.println("Global variable==>"+new Variables().a);//by object
		System.out.println("local variable==>"+c);	//by using identifier
	}
	public static void main(String[] args) {
		Variables obj=new Variables();
		obj.meth1();
		System.out.println("static variable :"+Variables.b);   		//by class name
		System.out.println("static variable :"+new Variables().b);	//by object
		System.out.println("static variable :"+b); //by identifier
	}
}

