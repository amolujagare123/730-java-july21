package ArraysDemo;

public class ArrayString {
	
	public static void main(String[] args)
	{
		
		String[] stArr = new String[5];
		
		stArr[0] = "Anjumol";
		stArr[1] = "Anuja";
		stArr[2] = "Ayushee";
		stArr[3] = "Dhanajay";
		stArr[4] = "Chakravarty";
		
		for(int i=0;i<stArr.length;i++)
			System.out.println(stArr[i]);
			
		
		System.out.println("-------------------");
		
		String[] stArr1 = {"Dhanajay","Keerthana","Kiran","Nadeem","Nikhil",
				"Raghavendra","sameer","sathish","shashi","sri vidya"};
		
		for(int i=0;i<stArr1.length;i++)
			System.out.println(stArr1[i]);
	}

}
