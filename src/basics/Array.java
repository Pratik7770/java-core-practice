package basics;

import java.util.Scanner;

public class Array 

{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		int arr1[];				//declaration
		arr1=new int[5];		//instantiation
		
		
		int arr2[]= {1,2,3,4,5};
		
		int arr3[]= new int[5];
		
		int arr4[]=new int[] {10,20,30,40,50};
		
		System.out.println(arr4.length);
		System.out.println(arr2[arr2.length-2]);
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i]);
		}

	}
	
	int [] meth2(int arr[]) 
	{
		return arr;
	}
	
	void meth3()
	{
		System.out.println("enter length of array");
		int arr[]=new int[sc.nextInt()];
		for (int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		
		for(int x:arr)
		{
			System.out.println(x);
		}
	}

	public static void main(String[] args) 
	{
		//Scanner sc=new Scanner(System.in);
		Array obj=new Array();
		//obj.meth1();
		//int input[]= {1,2,3};
		/*int result[]=obj.meth2(input);
				for(int x:result)
				{
					System.out.println(x);
				}
*/
		obj.meth3();
		
}
}
