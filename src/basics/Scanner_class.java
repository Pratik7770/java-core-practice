package basics;

// Scanner Class present in java.util package
import java.util.Scanner; 

/* Scanner Class methods
 * methods				Description
 * 
 *nextByte()			Accepts byte
 *nextShort()			short
 *nextInt()				int
 *nextLong()			long
 *next()				single world
 *nextLine()			line of string
 *nextBoolean()			boolean
 *nextFloat()			float
 *nextDouble()			double
 */
 

public class Scanner_class 
{
	Scanner sc=new Scanner(System.in);
	void voter() 
	{
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age<=18)
			System.out.println("you are eligibale for vote");
		else
			System.out.println("you are eligibale for vote");
		
	}
	void Vegetable_Store()
	{
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		int e=50;
		System.out.println("welcome to our Vegetable_Store");
		System.out.println("Please choise");
		System.out.println("1)onions :"+a);
		System.out.println("2)Chilli :"+b);
		System.out.println("3)Tomato :"+c);
		System.out.println("4)Brinjal :"+d);
		System.out.println("5)ladies finger :"+e);
		String name=sc.nextLine();
		switch(name) 
		{
		case "onions":
			System.out.println("1 kg of "+name+" is "+a);
			System.out.println("how many kgs you need?");
			int f=sc.nextInt();
			System.out.println(f+" kgs of "+name+" is "+f*a);
			break;
			
		case "Chilli":
			System.out.println("1 kg of "+name+" is "+b);
			System.out.println("how many kgs you need?");
			int g=sc.nextInt();
			System.out.println(g+" kgs of "+name+" is "+g*b);
			break;
		case "Tomato":
			System.out.println("1 kg of "+name+" is "+c);
			System.out.println("how many kgs you need?");
			int h=sc.nextInt();
			System.out.println(h+" kgs of "+name+" is "+h*c);
			break;
		case "Brinjal":
			System.out.println("1 kg of "+name+" is "+d);
			System.out.println("how many kgs you need?");
			int i=sc.nextInt();
			System.out.println(i+" kgs of "+name+" is "+i*d);
			break;
		case "ladies finger":
			System.out.println("1 kg of "+name+" is "+e);
			System.out.println("how many kgs you need?");
			int j=sc.nextInt();
			System.out.println(j+" kgs of "+name+" is "+j*e);
			break;
			default:
				System.out.println("coise correct input");
				break;
		
		}
		System.out.println("Thanks for Shopping with us... Please come back");
		 
		
	}
	
	public static void main(String[] args) {
		Scanner_class obj=new Scanner_class();
		//obj.voter();
		obj.Vegetable_Store();
	}
	

}
