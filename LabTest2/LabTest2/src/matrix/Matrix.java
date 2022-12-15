package matrix;

public class Matrix {

	static void matrixAdd(int arr1[][], int arr2[][], int row, int col) {
		int arr3[][] = new int[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int a[][]={{12,36,43},{26,42,35},{32,45,13}};    
		int b[][]={{18,32,46},{22,48,32},{14,27,49}};
		int n = 3, m =3;
		matrixAdd(a, b, n, m);
	}

}
