package course01.prj07homework;

public class prj7hm {

	static int[] randomArrayGereration(int n) {
		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) ((Math.random() * 50) - 25);
		}
		return a;
	}

	static void prinArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}

	static int sumPositivesOfArray(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				sum = sum + a[i];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int n = 10;
		int a[] = randomArrayGereration(n);
		prinArray(a);
		System.out.println("Task1");
		System.out.println("Сумма - " + sumPositivesOfArray(a));

		int max = Math.abs(a[0]);
		int indexMax = 0;
		int min = Math.abs(a[0]);
		int indexMin = 0;
		for (int i = 0; i < a.length; i++) {
			if (Math.abs(a[i]) < min) {
				min = Math.abs(a[i]);
				indexMin = i;
			}
			if (Math.abs(a[i]) > max) {
				max = Math.abs(a[i]);
				indexMax = i;
			}
		}
		System.out.println("Task2");
		prinArray(a);
		// System.out.println(min);
		// System.out.println(indexMin);
		// System.out.println(max);
		// System.out.println(indexMax);
		int multy = 1;
		if (indexMin < indexMax) {
			for (int i = indexMin + 1; i < indexMax; i++) {
				multy = multy * a[i];
			}
		} else {
			for (int i = indexMax + 1; i < indexMin; i++) {
				multy = multy * a[i];
			}
		}
		System.out.println(multy);
		System.out.println("Task3");
		prinArray(a);

		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] < a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		prinArray(a);
		System.out.println();
		System.out.println("var 3");

		a = randomArrayGereration(20);
		prinArray(a);
		System.out.println("Task1");
		int multyVar3 = 1;
		for (int i = 1; i < a.length; i = i + 2) {
			multyVar3 = multyVar3 * a[i];
		}
		System.out.println(multyVar3);
		int sumVar3 = 0;
		for (int i = 1; i < 9; i++) {
			sumVar3 = sumVar3 + a[i];

		}
		System.out.println("sum " + sumVar3);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < 0) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		prinArray(a);
	}
}
