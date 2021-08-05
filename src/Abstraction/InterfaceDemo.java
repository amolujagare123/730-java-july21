package Abstraction;

public interface InterfaceDemo {

	void start();
	void run();
	
	// public methods cant be non abstract (make it static to have a body)
	
	
	void display();
	
	static void display1()
	{
		
	}
	
	private void display2()
	{
		
	}
	
	default void display3()
	{
		
	}
	
	 public static void main(String[] args)
		{
			//InterfaceDemo ob = new InterfaceDemo();
			
			InterfaceDemo ob = new ChildInterface();
			ob.start();
			ob.run();
			
			InterfaceDemo.display1(); 
			// static methods are to be called using interface name
			
			ChildInterface ob1 = new ChildInterface();
			
			ob.display();
			
		}
	
}


interface AnotherInterface
{
	void display();
}

class ChildInterface extends ChildAbstract implements InterfaceDemo , AnotherInterface
{

	
	 public void start() {
		System.out.println("Start");
		
	}


	 public void run() {
			System.out.println("run");
	
	}


	@Override
	public void display() {

		System.out.println("display");
		
	}
	
	
	 
}


