package DateDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String dateStr0= "23-June-2016" ;
		
		SimpleDateFormat sd = new SimpleDateFormat("dd-MMMM-yyyy");
		
		Date date0 = sd.parse(dateStr0);
		
		System.out.println(date0);
		
		
		String dateStr1= "25 | June 19  8:34" ;
		SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy h:mm");
		Date date1 = sd1.parse(dateStr1);
		System.out.println(date1);
		
		System.out.println(sd.format(date1));
		
		



	}

}
