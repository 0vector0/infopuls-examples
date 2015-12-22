package course01.prj03;

public class prj31result {

	static int fmin(int x, int y) {
		// if (x >= y) return y; else return x;
		return (x >= y) ? y : x;
	}

	static int fmax(int x, int y) {
		// if (x >= y) return y; else return x;
		return (x >= y) ? x : y;
	}

	static void task1() {
		// 1. ���� 4 ����� ���� int. �������� �� � ������� ���������� ��
		// �������.
		int a = 2, b = 3, c = 1, d = 5;
		System.out.println("����������� - " + fmin(fmin(fmin(a, b), c), d));
	}

	static void task2() {
		// 2. ������� �� ������� ���������� ������������ ����� ����� ����
		// �������.
		int a = 1, b = 4, c = 4, d = 3;
		int myMax = fmax(fmax(fmax(a, b), c), d);
		int countMax = 0;
		if (myMax == a)
			countMax++;
		if (myMax == b)
			countMax++;
		if (myMax == c)
			countMax++;
		if (myMax == d)
			countMax++;

		System.out.println("������������ - " + myMax);
		System.out.println("count - " + countMax);
	}

	static void task3() {
		// 3. ���� 5 ����� (��� int). ������� ������� ����������, � �����
		// ���������� �� ������ �����.
		int a = 1, b = 4, c = 4, d = 3, e = 7;
		int myMax = fmax(fmax(fmax(fmax(a, b), c), d), e);
		int myMin = fmin(fmin(fmin(fmin(a, b), c), d), e);
	}

	static void task4() {
		// 4. ���� ����� 2� ������� (��� String). ���� ����� �����, �� �������
		// ��������� � ���, ������� �������� �������.
		String fio1 = new String("Vasya");
		String fio2 = new String("Vasya");
		String fio3 = new String("Petya");
		if (fio1.equals(fio2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	static void task5(int month) {
		// 5. ���� ����� ������ (��� int). ���������� ���������� ����� ����
		// (����, �����, ����, �����) � ������� �� �������.
		
		String season;
		switch (month) {
		case 12: 
		case 1:		
		case 2:	season = "winter";	break;
		case 3:
		case 4:
		case 5: season = "spring";	break;
		case 6:
		case 7:
		case 8: season = "summer";	break;
		case 9:
		case 10:
		case 11: season = "autumn";	break;
		default: season = "NULL";
		}
		System.out.println(season);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		task5(7);
		// task2();

	}

}
