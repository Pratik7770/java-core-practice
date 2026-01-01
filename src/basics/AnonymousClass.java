package basics;
//	4)Anonymous Inner Class

public class AnonymousClass 
{
	static AnonymousClassEx out=new AnonymousClassEx()  
	{
		void print()
		{
			super.print();
			System.out.println("i am from AnonymousClass");
		}
		
		
	};
public static void main(String[] args) {
	out.print();
}
}
