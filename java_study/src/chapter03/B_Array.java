package chapter03;

public class B_Array {

	public static void main(String[] args) {
		int[][] matrix;
		
		matrix = new int[3][3];
		
		matrix[0][0] =1;
		matrix[0][1] =2;
		matrix[0][2] =3;
		
		matrix[1][2] =4;
		
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}, {10,11,12}};
		
		for(int[] row: matrix2) {
			for(int value: row) {
				System.out.print(value + " ");
				
			}
			System.out.println();
		}
		
	}

}
