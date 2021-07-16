package ArraysDemo;

public class ArrayChar {
	
	public static void main(String[] args)
	{
		char[] chArr = new char[5];
		
		chArr[0] = 'i';
		chArr[1] = 'e';
		chArr[2] = '5';
		chArr[3] = '#';
		chArr[4] = 'A';
		
		for(int i=0;i<chArr.length;i++)
		{
			System.out.println(chArr[i]);
		}
		
		System.out.println("--------------------");
		
		char[] chArr1 = {'3','h','#','s','e','%'};
		
		for(int i=0;i<chArr1.length;i++)
		{
			System.out.println(chArr1[i]);
		}
		
	}
	
	

}
