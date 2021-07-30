package Methods;

import java.util.Date;

import ClassConstructors.pack2.Java3;

public class MethodsWithArguments {
	
	
	void display()
	{
		System.out.println("Method with no argument");
	}
	
	
	void intArgumentSingle(int a)
	{
		
		System.out.println("Method with single argument");
		System.out.println("a="+a);
	}
	
	void intArgumentMultiple(int a,int b)
	{
		
		System.out.println("Method with multi arguments");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	
	
	void argumentMultiple(int a,char c)
	{
		
		System.out.println("Method with multi arguments");
		System.out.println("a="+a);
		System.out.println("c="+c);
	}
	
	void stringArgument(String str)
	{
		System.out.println("Method with string arguments");
		System.out.println("str="+str);
	}
	
	void dateArgument(Date date)
	{
		System.out.println("Method with Date arguments");
		System.out.println("date="+date);
	}
	
	
	void singleDimentionalArray(int[] ar)
	{
		System.out.println("Method with array arguments");
		
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");
		
		System.out.println();
	}
	
	void twoDimentionalArray(String[][] stArr)
	{
		System.out.println("Method with 2D array arguments");
		
		for(int i=0;i<stArr.length;i++)
		{
			for(int j=0;j<stArr[0].length;j++)
			{
				System.out.print(stArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void objectArgument(Java3 obj)
	{
		obj.display3();
		
		System.out.println(obj.a3);
	}
	
	
	public static void main(String[] args) {
	
		MethodsWithArguments ob = new MethodsWithArguments();
		
		ob.display();
		ob.intArgumentSingle(45);
		ob.intArgumentMultiple(34,54);
		ob.argumentMultiple(89,'l');
		ob.stringArgument("amol");
		ob.dateArgument(new Date());
		
		
		int[] x = {12,4,1,67,12,78,90};
		
		ob.singleDimentionalArray(x);
		
		
		String[][] s = {
			
				{"abc1","pqr1","xyz1"},
				{"abc2","pqr2","xyz2"},
				{"abc3","pqr3","xyz3"},
				{"abc4","pqr4","xyz4"}
				
		};
		
		ob.twoDimentionalArray(s);
		
		
		Java3 ob3 = new Java3();
		
		ob3.a3 = 10;
		ob3.d3 = 10.1;
		ob3.c3='a';
		ob3.str3 = "selenium";
		
		ob.objectArgument(ob3);
	}

}
