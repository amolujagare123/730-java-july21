package StringDemos;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a Java class";
		
		String[] stArr = str.split("a");
		
		for(int i=0;i<stArr.length;i++)
			System.out.println(stArr[i]);
	}

}
