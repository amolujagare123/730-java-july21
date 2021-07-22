package StringDemos;

public class FirstIndexChar {
	
	public static void main(String[] args)
	{
		String str = "We live in ant a country called india";
		
		// print the words whose 1st index char is n
		
		String[] stArr = str.split(" ");
		
		for(int i=0;i<stArr.length;i++)
		{
			//if(stArr[i].length()>=2 )
			{		
				if( stArr[i].length()>=2 && stArr[i].charAt(1)=='n' )
				{
					System.out.println(stArr[i]);
				}
			}
		}
	}

}
