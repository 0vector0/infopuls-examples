package course01.prj04;

public class ForMain {

	// 1. ��� ������ ����� for ������� �� ����� �������� ����� �� 1 �� 99.
	static void task1() {
		for (int i = 1; i <= 99; i = i + 2) {
			System.out.println(i + " ");
		}
	}

	// 2. ���� ����� n ��� ������ ����� for ��������� n! (��������� �����)

	static int task2(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// 3. ���� ����� n ����� ������������ ���� ����� �� 0 �� n.
	static int task3(int n) {

		int com = 1;
		for (int i = 1; i <= n; i++) {
			com = com * i;
		}
		// System.out.println(sum);
		return com;
	}

	// 4. ����� ������� �������� ����� �� 0 �� n;
	static double task4(int n) {
		double sred = 0;

		int sum = task3(n);
		System.out.println(sum);
		sred = (double) sum / (n + 1);
		return sred;
	}

	// 5. ���� ����� n ��� ������ ����� for ��������� n! (n!=n*(n-1)!)

	static int task5(int n) {
		return task3(n);
	}

	// 6. ���� ����� n ��� ������ ����� for ��������� �����
	// ���������(f(n)=f(n-1)+f(n-2))
	// static int task6(int n) {
	// int f = 0;

	// }
	// task71
	static void task71() {
		int i = 1;
		while (i <= 99) {
			System.out.println(i + " ");
			i = i + 2;
		}
	}
	
	// task71
	static int task72(int n) {
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		return sum;
	}
	
	static int task73(int n) {
		

		int com = 1;
		int i = 1;
		while (i <= n) {
			com = com * i;
			i++;
		}
		return com;
	}
	
	//task74
	static double task74(int n) {
		double sred = 0;

		int sum = task73(n);
		System.out.println(sum);
		sred = (double) sum / (n + 1);
		return sred;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("task1");
		task1();
		System.out.println(" ");

		int n = 3;

		System.out.println("task2");
		System.out.println(task2(n));
		System.out.println(" ");

		// n = 3;
		System.out.println("task3");
		System.out.println(task3(n));
		System.out.println(" ");

		n = 3;
		System.out.println("task4");
		System.out.println(task4(n));
		System.out.println(" ");

		System.out.println("task5");
		System.out.println(task5(n));
		System.out.println(" ");
		
		
		//task1p
		
		int x = 2;
		n = 10;
		int multy = 1;
		
		for (int i = 1; i <= n; i++) {
			multy = multy * x;
		}
		System.out.println(multy);

		int xx = 1;
		int yy = 1;
		int ff = 0;
		
		for (int i = 0; i < 10; i++) {
			ff = yy + xx;
			// n n-1 n-2
			xx = yy;
			yy = ff;
		}
		System.out.println(ff);
		
	}

}
