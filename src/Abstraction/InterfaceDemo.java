package Abstraction;

public interface InterfaceDemo {

	void start();
	void run();
	
	// public methods cant be non abstract (make it static to have a body)
	
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
			
		}
	
}

class ChildInterface implements InterfaceDemo
{

	
	 public void start() {
		System.out.println("Start");
		
	}


	 public void run() {
			System.out.println("run");
	
	}
	
	
	 
}


