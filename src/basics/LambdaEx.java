package basics;
public class LambdaEx 
{
	void meth1() 
	{
		
		Lambda_Interface i=()->System.out.println("hey interface");
		i.meth1();
		
		Lambda_interfaceA i2=(int o,int p)->
		{
			if(o<10)
				
				return o+10;
			else
				
				return p+10;
		
		};
		i2.meth1(45,90);
		
		Lambda_Interface ii=new Lambda_Class()::show;	//:: method referancing
		ii.meth1();
		Lambda_Interface ii1= Lambda_Class::show1;		//static method call
		ii1.meth1();
		Lambda_Interface ii2=Lambda_Class::new ;		//constucter methed call
		ii2.meth1();
	}
	public static void main(String[] args) 
	{
		LambdaEx lE=new LambdaEx();
		lE.meth1();
		
	}
	

}
