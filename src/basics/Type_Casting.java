package basics;

public class Type_Casting 
{
	/*convert one datatype into another data type
	Type casting has two type 1)implicit 2)explicit
	implicit==>small------>big
	explicit==>big------>small
	
	implicit-----by compiler
	byte-->short-->int-->long-->float-->double
	
	explicit-----by programmer
	byte-->char
	short-->byte,char
	int-->byte,short,char
	long-->byte.short,char,int
	float-->byte,short,char,int,long
	doiuble-->byte,short,int,char,long,float
	*/
	
	void implicit() 
	{
		byte a=10;
		int b=a;
		System.out.println(a);//10
		System.out.println(b);//10
		System.out.println(a+b);
			
	}
	void explicit()
	{
		
		int a=35;
		char b=(char)a;
		byte c=(byte)a;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	public static void main(String[] args) {
		Type_Casting obj=new Type_Casting();
		obj.implicit();
		obj.explicit();
	}
	

}
