package basics;

/* control statements is-1)Selection, 2)iteration, 3)jump
 * 
 * 1)selection== if,if-else,if-else-is,switch
 * 2)iteration== while,do-while,for,for-each
 * 3)jump==break,continue,return
 */


public class Control_Statements 
{
	void star()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	void jump_statements() 
	{
		for(int i=1;i<=10;i++) 
		{
			if (i==5)
			{
				break;
				//continue;
				//return;
			}
			System.out.println(i);
		}
		
	}
	void for_each()
	{
		int arr[]= {10,20,30,40,50};
		System.out.println("retrive arry data from for each");
		for (int x:arr)
		{
			System.out.println(x);
		}
		System.out.println("retrive arry data from for loop");
		for(int i=0;i<5;i++) 
		{
			System.out.println(arr[i]);
		}
		System.out.println("retrive arry data reverse from for loop");
		for(int i=4;i>=0;i--) 
		{
			System.out.println(arr[i]);
		}
	}
	
	void for_loop() 
	{
		System.out.println("---for loop---");
		for(int i=1;i<=10;i++)
			{
			System.out.println(i);
			
			}
		
	}
	void while_loop(int a)
	{
		
		while(a<=10)
		{
		System.out.println(a);
		a++;
		}
	}
	void do_while()
	{
		int a=1;
		do
		{
		System.out.println(a);
		a++;
		}
		while(a<=10);
		
	}
	void switch_case()
	{
		//int a=10;
		int b=200;
		System.out.println("imlimenting switch case");
		switch(b)
		{
		case 5:
		System.out.println("case 5");
		break;
		
		case 8:
			System.out.println("case 8");
			break;
		
		case 10:
			System.out.println("case 10");
			break;
			
		default:
			System.out.println("default case");
			break;
		case 20:
			System.out.println("case 20");
			break;
			
			
		}
		System.out.println("switch is end");
		
	}
	void if_(int a)
	{
		System.out.println("if statement meth running");
		if(a<10)
		{
			System.out.println("if statement executed");
			
		}
		System.out.println("-------------------------------");
	}
	
	void if_else(int a, int b) 
	{
		System.out.println("if else statement meth running");
		if(b>a)
		{
			System.out.println("if statement executed");
		}
		else
		{
			System.out.println("else statement executed");
		}
		System.out.println("-------------------------------");
		
	}
	
	void if_elseif_else(int a)
	{
		System.out.println("if elseif else statement meth running");
		if(a>0)
		{
			System.out.println("if  statement meth running");
			
			
		}
		else if(a<0)
		{
			System.out.println("elseif statement meth running");
		}
		else
		{
			System.out.println("else statement meth running");
		}
		System.out.println("-------------------------------");
	}
	
	void Nested_if_else(int a, int b, int c) 
	{
		System.out.println("Nested_if_else statement meth running");
		if(a<10)
		{
			System.out.println("if statement executed");
			if(b>10)
			{
				System.out.println("nested if-if statement executed");
				
			}
			else
			{
				System.out.println("nested if-else statement executed");
			}
		}
		else
		{
			System.out.println("else statement executed");
			if(c>10)
			{
				System.out.println("nested else-if statement executed");
				
			}
			else
			{
				System.out.println("nested else-else statement executed");
			}
		}
		System.out.println("-------------------------------");
		
	}
	

	public static void main(String[] args) {
		Control_Statements obj=new Control_Statements();
		//obj.if_(1);
		//obj.if_else(1,2);
		//obj.if_elseif_else(10);
		//obj.Nested_if_else(5,50,100);
		//obj.switch_case();
		//obj.while_loop(0);
		//obj.do_while();
		//obj.for_loop();
		//obj.for_each();
		//obj.jump_statements();
		obj.star();
	}

}
