package ClassConstructors.pack1;

public class Java1 {
	
	public int a1;
	private double d1;
	char c1;
	String str1;
	
	void display1()
	{
		System.out.println("a="+a1);
		System.out.println("d="+d1);
		System.out.println("c="+c1);
		System.out.println("str="+str1);
	}
		
	

	public static void main(String[] args) {
		
		Java1 ob = new Java1();
		
		ob.a1 = 12;
		ob.d1 = 4.5;
		ob.c1 = 'g';
		ob.str1="amol";
		ob.display1();
		
    }
}
