package ClassConstructors.pack2;

import ClassConstructors.pack1.Java1;

public class Java3 extends Java1{
	
	public int a3;
	public double d3;
	public char c3;
	public String str3;
	
	public void display3()
	{
		System.out.println("a="+a3);
		System.out.println("d="+d3);
		System.out.println("c="+c3);
		System.out.println("str="+str3);
	}
		
	

	public static void main(String[] args) {
	  
		Java1 ob = new Java1();
		
		ob.a1 = 12;
		ob.d1 = 4.5;
		ob.c1 = 'g';
		ob.str1="amol";
		ob.display1();
		
		
		Java3 ob1 = new Java3();
		ob1.c1 ='h';
		ob1.str1 = "abcd";
    }
}
