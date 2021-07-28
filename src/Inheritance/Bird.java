package Inheritance;

public class Bird {
	
	void fly()
	{
		System.out.println("Bird can fly");
	}
	
	public static void main(String[] args)
	{
		Bird b = new Bird();
		b.fly();
		
		Sparrow s = new Sparrow();
		s.getSparrowColor();
		s.fly();
		
		Crow c = new Crow();	
		c.getCrowColor();
		c.fly();
	}

}

class Sparrow extends Bird 
{
	void getSparrowColor()
	{
		System.out.println("Yellow");
	}
}

 class Crow extends Bird
{
	void getCrowColor()
	{
		System.out.println("Black");
	}
	
	
}




