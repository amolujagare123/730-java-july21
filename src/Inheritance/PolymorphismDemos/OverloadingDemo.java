package Inheritance.PolymorphismDemos;

public class OverloadingDemo {

	int a;
	int b;
	
	void sum()
	{
		int c;
		c = a + b;
		System.out.println("c="+c);
	}
	

	void sum(int x, int y)
	{
		int c;
		c = x + y;
		System.out.println("c="+c);
	}
	

	void sum(int x, int y , int z)
	{
		int c;
		c = x + y +z;
		System.out.println("c="+c);
	}
	
	

	void sum(double x, double y)
	{
		double c;
		c = x + y;
		System.out.println("c="+c);
	}
	
	void sum(String x, String y)
	{
		String c;
		c = x + y;
		System.out.println("c="+c);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingDemo ob = new OverloadingDemo();
		
		ob.sum();
		ob.sum(10,10);
		ob.sum(10,10,10);
		ob.sum(10.1,10.1);
		ob.sum("java","Selenium");

	}

}
