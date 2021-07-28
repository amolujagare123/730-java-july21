package Inheritance;


class Animal2
{
	void eat()
	{
		System.out.println("Animal Eat");
	}
}

class Lion extends Animal2
{
	void eat()
	{
		System.out.println("Lion eat");
	}
	
	void lionMethod()
	{
		eat();
		super.eat();
	}

}

public class TestSuperMethod {
	
	public static void main(String[] args)
	{
		Lion l = new Lion();
		l.lionMethod();
	}
}
