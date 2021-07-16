package ArraysDemo;

public class TwoDimentional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {
				
				{1,1,1,1},
				{2,2,2,2},
				{3,3,3,3}
				
		};
		
		// row x col --> 3 x 4
		
		
		
		
		
		
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
