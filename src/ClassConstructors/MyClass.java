package ClassConstructors;

public class MyClass {
	
	int a;
	double d;
	char c;
	String str;
	
	void display()
	{
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		System.out.println("str="+str);
	}
		
	

	public static void main(String[] args) {

		
		/*int x; // local variable
		
		x =10; 
		
		System.out.println(x);*/
		
		
		MyClass ob = new MyClass();
		
		ob.a=20; // data member
		ob.d = 3.4;
		ob.c ='g';
		ob.str = "amol";
		ob.display() ;
		
		
		MyClass ob1 = new MyClass();
		
		ob1.a =90;
		ob1.d=45.6;
		ob1.c = 't';
		ob1.str ="vaishal";
		ob1.display();

		
	}

}
