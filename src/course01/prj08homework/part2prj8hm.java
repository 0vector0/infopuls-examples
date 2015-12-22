package course01.prj08homework;

public class part2prj8hm {

	// заполняем матрицу случайными числами
	static int[][] radnomMatrix(int n, int m) {
		int[][] matrix = new int[n][m];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 20 - 10);
			}
		}
		return matrix;
	}

	// печать матрицы и сумм в конце каждой строки
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j != matrix[i].length - 1) {
					//System.out.print(matrix[i][j] + ", ");
					System.out.printf("%2d", matrix[i][j]);
					System.out.print(", ");
				} else {
					//System.out.print(matrix[i][j] + " ");
					System.out.printf("%2d", matrix[i][j]);
					System.out.print("  ");
				}
			}
			System.out.print("Cумма = " + sumArray(matrix[i]));
			System.out.println();
		}
		System.out.println();
	}

	// считаем суммы положительных четных чисел в строке
	static int sumArray(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0 && a[i] > 0) {
				sum = sum + a[i];
			}
		}
		return sum;
	}

	// Сортируем матрицу
	static void matrixSort(int[][] matrix) {
		int[] tempArray = new int[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length - 1; j++) {
				if (sumArray(matrix[j]) > sumArray(matrix[j + 1])) {
					tempArray = matrix[j];
					matrix[j] = matrix[j + 1];
					matrix[j + 1] = tempArray;
				}
			}
		}
	}

	public static void main(String[] args) {
		// Характеристикой строки целочисленной матрицы назовем сумму ее
		// положительных четных элементов. Переставляя строки заданной матрицы,
		// расположить их соответствии с ростом характеристик.

		int n = 4;
		int m = 5;
		int[][] matrix = radnomMatrix(n, m);

		printMatrix(matrix);

		matrixSort(matrix);

		printMatrix(matrix);
		
	}
}
