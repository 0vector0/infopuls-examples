package course01.prj03;

public class prj31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� 4 ����� ���� int. �������� �� � ������� ���������� �� �������.");

		int a = 3;
		int b = 5;
		int c = 23;
		int d = 23;
		int count = 1;

		if ((a < b) && (a < c) && (a < d)) {
			System.out.println(a);
			
		}
		if ((b < a) && (b < c) && (b < d)) {
			System.out.println(b);
		}
		if ((c < a) && (c < b) && (c < d)) {
			System.out.println(c);
		}
		if ((d < a) && (a < b) && (a < c)) {
			System.out.println(d);
		}
		
		
		
		
		System.out.println(" ");
		System.out.println("������� �� ������� ���������� ������������ ����� ����� ���� �������.");
		if ((a > b) && (a > c) && (a > d)) {
			System.out.println(a);
			count = count + 1;
			
		}
		if ((b > a) && (b > c) && (b > d)) {
			System.out.println(b);
			count = count + 1;
		}
		if ((c > a) && (c > b) && (c > d)) {
			System.out.println(c);
			count = count + 1;
		}
		if ((d > a) && (a > b) && (a > c)) {
			System.out.println(d);
			count = count + 1;
		}
		System.out.println(count);

		System.out.println(" ");
		System.out.println("���� 5 ����� (��� int). ������� ������� ����������, � ����� ���������� �� ������ �����.");
		System.out.println(Math.min(Math.min(a, b), (Math.min(c, d))));
		System.out.println(Math.max(Math.max(a, b), (Math.max(c, d))));

		System.out.println(" ");
		System.out.println("���� ����� 2� ������� (��� String).");
		System.out.println("���� ����� �����, �� ������� ��������� � ���, ��� ���� �������� �������.");
		String name1 = "����";
		String name2 = "����";

		if (name1.equals(name2)) {
			System.out.println("��� �����");
		} else {
			System.out.println("����� ������");
		}
		
		System.out.println(" ");
		System.out.println("����� ����");
		int day = 4;
		
		switch (day) {
		case 1: System.out.println("����");
		break;
		case 2: System.out.println("����");
		break;
		case 3: System.out.println("�����");
		break;
		case 4: System.out.println("�����");
		break;
		case 5: System.out.println("�����");
		break;
		case 6: System.out.println("����");
		break;
		case 7: System.out.println("����");
		break;
		case 8: System.out.println("����");
		break;
		case 9: System.out.println("�����");
		break;
		case 10: System.out.println("�����");
		break;
		case 11: System.out.println("�����");
		break;
		case 12: System.out.println("����");
		break;
		default: System.out.println("������");
		break;
	}
	}
}
