package WrapperClassDemo;

public class Conversions {

	public static void main(String[] args) {

			String str1 = "10";
			String str2 = "20";
			
			System.out.println(str1+str2);
		
			// string into Integer
			
			int a1 = Integer.parseInt(str1);
			int a2 = Integer.parseInt(str2);
			
			System.out.println(a1 + a2);
			
			String str3 = "12.30";
			String str4 = "11.40";
						
			System.out.println(str3+str4);
			
			 double d1 = Double.parseDouble(str3);
			 double d2 = Double.parseDouble(str4);
			 
			 System.out.println(d1+d2);
				
			
			// Float.parseFloat(str4);
			 
			 String str5 = "false";
			 
			boolean result = Boolean.parseBoolean(str5);
			
			if(result)
				System.out.println("Result is true");
			else
				System.out.println("Result is not true");
			
			
			String str6 ="a";
			// String into char
			
			// Character.parseCharacter(str6) - not possible
			
			char ch = str6.charAt(0);
			
			System.out.println(ch);
			
			
			

	}

}
