package StringDemos;

public class EndingCharDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hey baby you are so lovely" ;
		
		    String[] stArr = str.split(" ");
		    
		    for(int i=0;i<stArr.length;i++)
		    {
		    	
		     String tempCurrString = stArr[i];
		     int l = tempCurrString.length();
		     
		     if(tempCurrString.charAt(l-1)=='y') 
		    	System.out.println(stArr[i]);
		    }

	}

}
