package Methods;

public class MethodReurningValue {

	int getInt()
	{
		System.out.println("inside get int method");
		
		return 10;
	}
	
	int getInt1()
	{
		System.out.println("inside get int method");
		
		int a =15;
		return a;
	}
	
	
	public static void main(String[] args) {

		MethodReurningValue ob = new MethodReurningValue();
		
		int x = ob.getInt();
		
		System.out.println("x="+x);
		
		System.out.println(ob.getInt());
		


	}

}
