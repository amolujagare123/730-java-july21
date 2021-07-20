package StringDemos;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 ="amol";
		String str2 ="amol";
		String str3 ="Amol";
		String str4 ="raj";
		String str5 = new String("amol");
		
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5)); // true
		
		System.out.println(str1==str2); // true
	
		System.out.println(str1==str5); // false
		
		

	}

}
