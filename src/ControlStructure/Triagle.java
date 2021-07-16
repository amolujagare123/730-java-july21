package ControlStructure;

public class Triagle {

	public static void main(String[] args) {

		int a = 90;
		int b = -90;
		int c = 90;
		//
		
		if(a+b+c==180 && a>0 && b>0 && c>0)
		{	
			if(a==b && b==c)
				System.out.println("Equilateral triangle");
			
			if(a !=b && b!=c &&  c!= a)
				System.out.println("Scalene triangle");
			
			if (a==90 || b==90 || c==90)
				System.out.println("Righ angled triangle");
	
			if ((a==b && b!=a) || (b==a && b!=c) || (c==a && a!=b))
				System.out.println("Isoscalene triangle");
		}
		else
			System.out.println("This is not a triagle");
	}

}
