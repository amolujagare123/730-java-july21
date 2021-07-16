package ControlStructure;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =20 ; 
		int b =10;
		int c;
		
		String operation ="mult";
		
		switch(operation)
		{
			case "add" : c = a + b;
					System.out.println("Addition="+c);
					break;
					
			case "sub" : c = a - b;
						System.out.println("Substraction="+c);
						break;
				
			case "mult" : c = a * b;
						System.out.println("Multiplication="+c);
						break;
					
			case "div" : c = a / b;
						System.out.println("Division="+c);
						break;
				
			default : System.out.println("wrong choice");
						break;

		
		}

	}

}
