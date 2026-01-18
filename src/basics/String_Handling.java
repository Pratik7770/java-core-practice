package basics;

public class String_Handling 
{
	String s1="pratik";
	char arr[]= {'j','a','v','a'};
	String s2=new String(arr);
	String s3=new String("Pratik");
	void meth1() 
	{
	System.out.println(s2.concat(s1)+",,,");	
		
	}
	public static void main(String[] args) {
		
		String_Handling obj=new String_Handling ();
		obj.meth1();
	}

}
