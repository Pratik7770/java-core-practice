package basics;
//	3)Method Local Inner Class

public class MethodLocalInnerClass {

	void show() 
	{
		String s="Pratik";
		//class inside method
		class MethodLocalIntoClass
		{
			void display()
			{
				String data=s+" Pawar";
				System.out.println(data);
				
			}
			
		}
		MethodLocalIntoClass obj=new MethodLocalIntoClass();
		obj.display();
		
	}
	public static void main(String[] args) {
		new MethodLocalInnerClass().show();
	}
}
