package basics;

public class Wrapper_Classes 

{
	/*convert data type into Class Object
	 * Integer
	 * Byte
	 * Short
	 * Float
	 * Double
	 * Character
	 * Boolean
	 * 
	 * two type--->Autoboxing and Auto Unboxing
	 * 
	 * autoboxing
	 * byte b=10;
	 * Byte b1=Byte.valueof(b);
	 * byte b2=b;
	 * 
	 * 
	 * auto unboxing 
	 * Byte b=new Byte("10");
	 * byte b1=b.byteValue();
	 * 	 */
	
	void auto_boxing() {
		
	
	int a=111;
			Integer a1=Integer.valueOf(a);
			Integer a2=a;
			
			System.out.println(a);
			System.out.println(a1);
			System.out.println(a2);
			
	}
	void auto_unboxing(){
		
		Byte b=new Byte((byte)10);
		byte b1=b.byteValue();
		System.out.println(b);
		System.out.println(b1);
		
		Integer a=new Integer(20);
		int a1=a.intValue();
		System.out.println(a);
		System.out.println(a1);
	}
public static void main(String[] args) {
	
	Wrapper_Classes obj=new Wrapper_Classes();
	obj.auto_boxing();
	obj.auto_unboxing();
}

}
