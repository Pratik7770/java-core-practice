package basics;
public class Constructor 
{
	public Constructor ()
	{
		System.out.println("sunday");
		Constructor obj=new Constructor(10);
		System.out.println("tuesday");
		String s=obj.display("Challenge accepted");
		System.out.println(s);
	}
	public Constructor (int temp) 
	{ 
		System.out.println("saturday");
		new Constructor (10,20);
		System.out.println("monday");
	}
	String display(String s)
	{
		System.out.println("in next statement i return string value");
		return s;
	}
	public Constructor (int data , int temp)
	{
		System.out.println("thursday");
	}
	public static void main(String[] args) {
		Constructor obj=new  Constructor ();
		System.out.println("output verified");
	}

}
			//sunday saturday thursday monday tuesday insirsv challenge accepted outputv
			  