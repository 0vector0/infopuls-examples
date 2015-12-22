package course01.prj08;

public class MainMatrix {

	static void transpMatrixMethod(int[][] matrix, int[][] transpMatrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				transpMatrix[j][i] = matrix[i][j];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Дана целочисленная прямоугольная матрица.
		// Определить количество столбцов, не содержащих ни одного нулевого
		// элемента.

		int[][] matr1 = { { 3, 5, 2, 0 }, { 4, 6, 2, 1 }, { 3, 1, 7, 2 } };
		int n = matr1.length;
		int m = matr1[0].length;

		int[][] transpMatrix = new int[m][n];

		transpMatrixMethod(matr1, transpMatrix);

		// boolean flag0 = false;
		int sum = 0;
		int maxSum = 0;
		// int countRowWithout0 = 0;
		int iMaxSum = 0;
		boolean firstSum = true;
		for (int i = 0; i < transpMatrix.length; i++) {
			// до обработки строки
			// flag0 = false;
			sum = 0;
			// iMaxSum = 0;
			System.out.println("-------------");
			// -----------------------
			for (int j = 0; j < transpMatrix[i].length; j++) {
				sum = sum + transpMatrix[i][j];
				System.out.print(transpMatrix[i][j] + " ,");
			}
			// после прохода строчки
			if (firstSum) {
				maxSum = sum;
				iMaxSum = i;
				firstSum = false;
			} else if (maxSum < sum) {
				maxSum = sum;
				iMaxSum = i;
			}
			System.out.println("sum = " + sum);
			// ----------------
		}
		System.out.println();
		System.out.println("maxSum = " + maxSum);
		System.out.println("iMaxSum = " + iMaxSum);

		
		
		
		
	}

}
