package Abstraction;

public abstract class AbstactDemo {

	abstract int run();
	abstract void start();
	
	void anotherMethod()
	{
		System.out.println("Another method");
	}
	
	public static void main(String[] args)
	{
		//AbstactDemo ob = new AbstactDemo();
		
		AbstactDemo ob = new ChildAbstract();
		ob.run();
		ob.start();
		ob.anotherMethod();
				
	}
}


class ChildAbstract extends AbstactDemo
{
	int run()
	{
		System.out.println("run");
		
		return 90;
	}
	
	void start()
	{
		System.out.println("start");
	}
	
	void another()
	{
		
	}

}
