package basics;


	//2)static Inner Class

public class StaticInnerClass 
{
	int a=10;	//Instance
	static int b=20;	//static
	
	static class StaticIntoClass
	{
		void display()
		{
			System.out.println("I am from Inner class");
			System.out.println("Instance variable : "+new StaticInnerClass().a);
			System.out.println("static variable : "+b);
		}
		static
		{
			System.out.println("I am from inner static block");
		}
		StaticIntoClass()
		{
			System.out.println("inner class Constructor");
		}
		public static void main(String[] args) {
			System.out.println("main() from inner class");
			new StaticIntoClass().display();
		}
	}
	static
	{
		System.out.println("I am from Outer static block");
	}
	StaticInnerClass(){
		System.out.println("i am from outer class constuctor");
	}
	public static void main(String[] args) {
		System.out.println("main() am from outer class");
		
	}
	
}
//when a time of exucution (compiler give option )we need to chose any one main()

