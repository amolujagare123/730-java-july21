package Inheritance;


class Animal
{
	
	String color = "black";
	
	void eat()
	{
		System.out.println("eat");
		System.out.println(color); // black
		
	}
		
}

class Dog extends Animal
{
	String color = "white";
	
	void bark()
	{
		System.out.println("bark");
		System.out.println(color); // white
		System.out.println(super.color); // black
	}
}


class BabyDog extends Dog
{ 
	String color = "gray";
	
	void weep()
	{
		System.out.println("weep");
		System.out.println(color); // gray
		System.out.println(super.color); // white
	}
	
}


public class TestMultiLevelInheritance {

	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.eat();

		Dog d = new Dog();
		d.bark();
		//d.eat();
		
		BabyDog bd = new BabyDog();
		
		bd.weep();
		//bd.bark();
		//bd.eat();
	}
	
}
