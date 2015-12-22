package course01.prj07a;

public class MainMas {

	// пример сортировки из занятия
	static void bublesort(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length - 1 - j; j++)
				if (mas[j] < mas[j + 1]) {
					int temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
		}

	}

	// метод вывода массива на экран
	static void printArray(int mas[]) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + ", ");

		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mas = { 4, -6, 23, 2, 30, 5, 6, 4, -1, -4, 8 };
		// bublesort(mas);

		printArray(mas);

		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				sum = sum + mas[i];
			}

		}
		System.out.println();
		System.out.println("task1 - " + sum);

		int maxIndex = 0;
		int minIndex = 0;
		int max = mas[0];
		int min = mas[0];

		for (int i = 0; i < mas.length; i++) {
			if (max > mas[i]) {
				maxIndex = i;
				max = mas[i];
			}
		}
		// System.out.println();
		// System.out.println(max);
		// System.out.println(maxIndex);

		for (int i = 0; i < mas.length; i++) {
			if (min < mas[i]) {
				minIndex = i;
				min = mas[i];
			}

		}
		// System.out.println(min);
		// System.out.println(minIndex);
		int multy = 1;

		if (minIndex < maxIndex) {
			for (int i = minIndex + 1; i < maxIndex; i++) {
				multy = multy * mas[i];
			}
		} else {
			for (int i = maxIndex + 1; i < minIndex; i++) {
				multy = multy * mas[i];
			}
		}
		// System.out.println();
		System.out.println("task 2 - " + multy);

		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = 0; j < mas.length - 1 - i; j++) {
				if (mas[j] > mas[j + 1]) {
					int temp;
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}

			}
		}

		System.out.print("task 3 - ");

		printArray(mas);

		/// пример от предподавателя

		sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0)
				sum = sum + mas[i];

		}
		System.out.println(sum);

		int myMin = mas[0];
		int iMyMin = 0;
		int myMax = mas[0];
		int iMyMax = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > myMax) {
				myMax = mas[i];
				iMyMax = i;
			}
			if (mas[i] < myMin) {
				myMin = mas[i];
				iMyMin = i;
			}
		}
		System.out.println("myMin - " + myMin);
		System.out.println("iMyMax - " + iMyMax);
		multy = 1;
		if (iMyMin < iMyMax) {
			for (int i = iMyMin + 1; i < iMyMax; i++) {
				if (mas[i] != 0) {
					multy = multy * mas[i];
				}
			}
		} else {
			for (int i = iMyMax + 1; i < iMyMin; i++) {
				if (mas[i] != 0) {
					multy = multy * mas[i];
				}

			}
		}
		System.out.println("multy - " + multy);
	}
}
