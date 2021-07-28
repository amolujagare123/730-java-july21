package Inheritance;

class Employee
{
	int salary = 20000;
	
	void getEmpMethod()
	{
		System.out.println("I am in getEmployee Method");
	}

}

class Programmer extends Employee
{
  int bonus =5000;
  
  void getProgrammerMethod()
  {
	  System.out.println("I am in getProgrammerMethod Method");
  }

}




public class TestSingleInheritance {

	public static void main(String[] args) {


		Programmer p = new Programmer();
		
		System.out.println(p.bonus);
		p.getProgrammerMethod();
		
		System.out.println(p.salary);
		p.getEmpMethod();
		

	}

}
