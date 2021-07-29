package Inheritance.PolymorphismDemos;

class Parent
{
	
	void myMethod()
	{
		System.out.println("Parent method");
	}
	
}


class Child extends Parent
{
	@Override
	void myMethod()
	{
		System.out.println("Child method");
		System.out.println("Different implementation");
	}

}
public class TestOverriding {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.myMethod();
		
		
		Parent p1 = new Child(); // object reference / upcasting
		p1.myMethod();
	}

}
