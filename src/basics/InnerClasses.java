package basics;
  /*	java provide 4 type of classes
   *	1) Nested Inner Class
   *	2)static Inner Class
   *	3)Method Local Inner Class
   *	4)Anonymous Inner Class
   */


	//	1) Nested Inner Class

public class InnerClasses 
{
	private void meth1()
	{
		System.out.println("i am from outer class");

	}
	InnerClasses()
	{
		System.out.println("Outer class constructer");
		
	}
	public class IntoClass
	{
		void meth2() 
		{
			System.out.println("i am from inner class");
			System.out.println("we can use all Access modifiers for inner class");
			meth1();	
		}
		IntoClass()
		{
			System.out.println("Inner class constructer");
		}
		//we can write main() inside class only if it is static inner class
	}
	public static void main(String[] args)
	{
		InnerClasses.IntoClass obj=new InnerClasses().new IntoClass();
		obj.meth2();
	}
}
