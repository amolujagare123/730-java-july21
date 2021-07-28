package Inheritance;


class Animal1
{
	String color = "black";
	
	Animal1()
	{
		System.out.println("inside animal constructor");
	}
}

class Tiger extends Animal1
{
	String color ="Yellow";
	
	Tiger()
	{
		//super();
		System.out.println("inside Tiger constructor");
	}
	
	void tigerMethod()
	{
		System.out.println("color="+color);
		System.out.println("color="+super.color);
	}

}

public class TestSuperDatamember {
	
	public static void main(String[] args)
	{
		Tiger t = new Tiger();
		//t.tigerMethod();
	}
}
