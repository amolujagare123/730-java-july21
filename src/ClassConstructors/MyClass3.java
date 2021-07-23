package ClassConstructors;

public class MyClass3 {
	
	int a;
	double d;
	char c;
	String str;
	
	MyClass3()
	{
		a = 11;
		d =1.1;
		c ='f';
		str="selenium";
		
		System.out.println("i am inside constructor");
	}

	void display()
	{
		//a = 23;
		
		System.out.println("a="+a); 
		System.out.println("d="+d);
		System.out.println("c="+c);
		System.out.println("str="+str);
	}
			

	public static void main(String[] args) {
		
		MyClass3 ob = new MyClass3();
		//ob.display();
		
	}

}
