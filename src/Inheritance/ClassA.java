package Inheritance;

public class ClassA {

	int a;
	void displayA()
	{
		System.out.println("inside displayA");
	}
	
	public static void main(String[] args)
	{
		
		ClassB ob = new ClassB();
		
		ob.b =11;
		ob.displayB();
		
		ob.a =101;
		ob.displayA();
		
	}
}

class ClassB extends ClassA
{

	int b;
	void displayB()
	{
		System.out.println("inside displayB");
	}
	
	
}
