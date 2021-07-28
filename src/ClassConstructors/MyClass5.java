package ClassConstructors;

public class MyClass5 {
	
	int a;
	double d;
	char c;
	String str;
	
	MyClass5(int a, double d, char c, String str)
	{
		this.a = a;
		this.d = d;
		this.c = c;
		this.str=str;
		
		System.out.println("i am inside constructor");
	}

	void display()
	{
		//a = 23;
		
		System.out.println("a="+a); 
		System.out.println("d="+d);
		System.out.println("c="+c);
		System.out.println("str="+str);
	}
			

	public static void main(String[] args) {
		
		MyClass5 ob = new MyClass5(10,2.3,'r',"abc");
		ob.display();
		
	}

}
