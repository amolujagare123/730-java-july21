package ExceptionHandling;

public class ThrowDemo {

	void checkNumber(int i) // 1 - 10 
	{
		if(i>=1 && i<=10)
			System.out.println("we are safe");
		else
			throw new ArithmeticException("we are in danger");
	}
	
	
	
	public static void main(String[] args) {

		ThrowDemo ob = new ThrowDemo();
	
		int a =11;
		
		ob.checkNumber(a);
		

		System.out.println("End of the program");

	}

}
