package DateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
	
	public static void main(String[] args) {
	
		Date date = new Date(); 
		System.out.println(date);
		
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
		
		String dateStr = sd.format(date);
		System.out.println(dateStr);
		
		SimpleDateFormat sd1 = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println(sd1.format(date));
		
	}

}
