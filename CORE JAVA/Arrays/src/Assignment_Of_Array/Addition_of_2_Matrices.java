package Assignment_Of_Array;

public class Addition_of_2_Matrices {

	public static void main(String[] args) {
		// creating two matrixes
		int a[][] = { {4,5,8,2}, {1,2,5,3} };
		int b[][] = { {1,3,1,2}, {5,4,9,5} };
		
		//creating a matrix which will store addition of two matrix
		int c[][]=new int[2][4];
		
		//adding two matrix in loop
		//for row=2
		//for column =4
		for(int i=0;i<2;i++)
		{
			//for column=4
			for(int j=0;j<4;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
