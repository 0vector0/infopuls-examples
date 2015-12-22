package course01.prj08homework;

public class part3prj8hm {

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

	/*
	 * static int sumArray(int[] a) { int sum = 0; for (int i = 0; i < a.length;
	 * i++) { sum = sum + a[i]; } return sum; }
	 */

	// печать матрицы
	static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j != matrix[i].length - 1) {
					System.out.printf("%2d", matrix[i][j]);
					System.out.print(", ");
				} else {
					System.out.printf("%2d", matrix[i][j]);
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		// System.out.println();
	}

	static int countOfColumn(int matrix[][]) {
		int count = 0;
		for (int j = 0; j <= matrix.length; j++) {
			for (int i = 0; i < matrix.length; i++) {
				if (matrix[i][j] == 0) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	static int numberOfMatches(int test[]) {
		int t = test[0];
		int count = 0;
		int countResult = 0;
		for (int i = 1; i < test.length; i++) {
			if (test[i] == t) {
				count++;
			} else {
				count = 0;
			}

			t = test[i];
			if (count > countResult) {
				countResult = count;
			}
		}
		return countResult;
	}

	public static void main(String[] args) {

		// Вариант 2
		// Дана целочисленная прямоугольная матрица.

		int n = 3;
		int m = 4;
		int[][] matrix = radnomMatrix(n, m);

		printMatrix(matrix);

		// task1 количество столбцов, содержащих хотя бы один нулевой элемент;
		System.out.print("Task1 - ");
		System.out.println("Количество столбцов - " + countOfColumn(matrix));
		System.out.println();

		// task2 номер строки, в которой находится самая длинная серия
		// одинаковых элементов.
		System.out.println("Task2");

		// Создадим матрицу для теста
		int[][] matr = { { 3, 3, 3, 0 }, { 2, 2, 2, 2 }, { 4, 0, 4, 4 } };

		printMatrix(matr);

		int number = 0;
		int numberResult = 0;
		int indexRow = 0;
		for (int i = 0; i < matr.length; i++) {
			number = numberOfMatches(matr[i]);
			if (number > numberResult) {
				numberResult = number;
				indexRow = i;
			}
		}
		System.out.println("В строке " + indexRow + " серия из " + (numberResult + 1) + " одинаковых чисел");
	}
}
