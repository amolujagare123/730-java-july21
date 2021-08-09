package WrapperClassDemo;

public class WrapperDemo2 {
	
	
	public static void main(String[] args)
	{
		
		
		Integer ii = new Integer(10);
		
		System.out.println("ii="+ii); 
		
		int i = ii.intValue(); // unboxing / unwrapping
		
		System.out.println("i="+i); 
		
		int i1 = ii; // auto unboxing / auto unwrapping
		
		System.out.println("i="+i); 

		
	} 

}
