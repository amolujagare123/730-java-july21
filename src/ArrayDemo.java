
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = new int[5];
		
		a[0] = 13;
		a[1] = 45;
		a[2] = 6;
		a[3] = 9;
		a[4] = 8;
				
		//System.out.println(a);
		
		int l = a.length;
		
		System.out.println("length="+l);
						
		/*for(int i=0; i <5; i++)
		{
			System.out.println(a[i]);
		}*/
		
		
		for(int i=0; i <a.length; i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
