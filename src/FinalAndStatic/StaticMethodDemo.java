package FinalAndStatic;

public class StaticMethodDemo {

	String name;
	static String college="ITS";
	
	void myMethod() // non static method
	{
		System.out.println("inside mymethod");
				
		System.out.println("collge="+college);// static members are allowed
		System.out.println("name="+name); // non static members are allowed
		myMethod(); // non static members are allowed
	}
	
	static void method2() // static method
	{
		System.out.println("inside mymethod2");
		
		System.out.println("collge="+college);// static members are allowed
	//	System.out.println("name="+name); // non static members are not allowed
	//	myMethod(); // non static members are not allowed
	}
	
	
	public static void main(String[] args) {

		StaticMethodDemo ob  = new StaticMethodDemo();
		
		ob.method2();

		StaticMethodDemo.method2();
	}

}
