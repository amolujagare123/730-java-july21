package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String dateStr0= "23-June-2016" ;  // dd-MMMM-yyyy
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMMM-yyyy");
		
		Date date = sd.parse(dateStr0);
		
		System.out.println(date);
		

	}

}
