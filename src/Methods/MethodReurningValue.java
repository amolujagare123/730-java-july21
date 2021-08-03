package Methods;

import ClassConstructors.pack1.Java2;

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
	
	
	
	int[] getMyArray()
	{
		int[] x = {23,12,11,15,17,10};
		return x;
	}
	
	
	String[][] getMyStringArray()
	{
		
		String[][] s = {
				
				{"abc1","pqr1","xyz1"},
				{"abc2","pqr2","xyz2"},
				{"abc3","pqr3","xyz3"},
				{"abc4","pqr4","xyz4"}
				
		};
		
		return s;
	}
	
	
	Java2 getMyObject()
	{
		Java2 obj = new Java2();
		obj.a2 = 10;
		obj.d2 = 90.1;
		obj.c2 = 'c';
		obj.str2 = "java";
		
		return obj;
		
	}
	
	public static void main(String[] args) {

		MethodReurningValue ob = new MethodReurningValue();
		
		int x = ob.getInt();
		
		System.out.println("x="+x);
		
		System.out.println(ob.getInt());
		
		
		int[] a = ob.getMyArray();
		
		for(int i = 0 ; i<a.length ; i++)
		{
			System.out.println(a[i]);
		}

		
		String[][] stArr = ob.getMyStringArray();
		
		for(int i=0;i<stArr.length;i++)
		{
			for(int j=0;j<stArr[0].length;j++)
			{
				System.out.print(stArr[i][j]+" ");
			}
			System.out.println();
		}

		
		Java2 j2 = ob.getMyObject();
		
		j2.display2();
	}

}
