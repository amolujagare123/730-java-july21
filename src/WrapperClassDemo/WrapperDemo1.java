package WrapperClassDemo;

public class WrapperDemo1 {
	
	
	public static void main(String[] args)
	{
		
		int i = 10;
		System.out.println("i="+i);
		
		Integer ii = new Integer(i);
		
		System.out.println("ii="+ii); // boxing / wrapping
		
		Integer ii1 = i;
		
		System.out.println("ii1="+ii1); // auto boxing / auto  wrapping
		
	} 

}
