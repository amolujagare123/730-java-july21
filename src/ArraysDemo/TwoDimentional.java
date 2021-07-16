package ArraysDemo;

public class TwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= new int[4][3];
		
		a[0][0] = 12;
		a[0][1] = 42;
		a[0][2] = 13;

		a[1][0] = 22;
		a[1][1] = 32;
		a[1][2] = 23;

		a[2][0] = 21;
		a[2][1] = 31;
		a[2][2] = 22;

		a[3][0] = 11;
		a[3][1] = 21;
		a[3][2] = 12;
		
		int row = a.length;
		int col = a[0].length;
		
		System.out.println("row="+row);
		System.out.println("col="+col);
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}


	}

}
