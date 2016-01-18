package prj11homework;

import java.util.Scanner;

public class menu {

	private static Scanner sc = new Scanner(System.in);
	private static int inputNumber = 9999;
	static int i = 0;

	protected static int inputInt() {
		while (!sc.hasNextInt()) {
			System.out.println("Введите число");
			sc.nextLine();
		}
		int result = sc.nextInt();
		return result;
	}

	protected static void menu1(CVehicle tr[]) {
		inputNumber = 9999;
		System.out.println("Введите 1 для создания обьектов");
		System.out.println("Введите 2 для печати обьектов");
		System.out.println("ВВедите 3 для удаления всех обьектов");
		System.out.println("Введите 0 для выхода");

		while (inputNumber != 1 && inputNumber != 2 && inputNumber != 3 && inputNumber != 0) {
			System.out.println("Введите 1 / 2 / 3 / 0");
			System.out.println();
			inputNumber = inputInt();
		}

		switch (inputNumber) {
		case 1: {
			menu11(tr);
			menu1(tr);
			break;
		}
		case 2: {
			menu12(tr);
			menu1(tr);
			break;
		}
		
		case 3: {
			for (int i = 0; i < tr.length; i++) {
				tr[i] = null;
			}
			menu1(tr);
			break;
		}
		case 0: {
			break;
		}
		}
	}

	protected static void menu11(CVehicle tr[]) {
		inputNumber = 9999;
		System.out.println("Введите 1 для создания автомобиля");
		System.out.println("Введите 2 для создания самолета");
		System.out.println("Введите 3 для создания корабля");
		System.out.println("Введите 0 для выхода в предыдущее меню");

		while (inputNumber != 1 && inputNumber != 2 && inputNumber != 3 && inputNumber != 0) {
			System.out.println("Введите 1 / 2 / 3 / 0");
			System.out.println();
			inputNumber = inputInt();
		}

		switch (inputNumber) {
		case 1: {
			if (i < tr.length) {
				tr[i] = new CCar();
				i++;
			} else {
				System.out.println("Массив заполнен");
				System.out.println();
			}
			menu11(tr);
			break;
		}
		case 2: {
			if (i < tr.length) {
				tr[i] = new CPlane();
				i++;
			} else {
				System.out.println("Массив заполнен");
				System.out.println();
			}
			menu11(tr);
			break;
		}
		case 3: {
			if (i < tr.length) {
				tr[i] = new CShip();
				i++;
			} else {
				System.out.println("Массив заполнен");
				System.out.println();
			}
			menu11(tr);
			break;
		}
		case 0: {
			break;
		}
		}
	}

	protected static void menu12(CVehicle tr[]) {
		inputNumber = 9999;

		System.out.println("Введите 1 для вывода информации о всем транспорте");
		System.out.println("Введите 2 для вывода информации о автомобилях");
		System.out.println("Введите 3 для вывода информации о  самолетах");
		System.out.println("Введите 4 вывода информации о  кораблях");
		System.out.println("Введите 0 для выхода в предыдущее меню");
		System.out.println();

		while (inputNumber != 1 && inputNumber != 2 && inputNumber != 3 && inputNumber != 4 && inputNumber != 0) {
			System.out.println("Введите 1 / 2 / 3 / 4 / 0");
			System.out.println();
			inputNumber = inputInt();
		}

		/*
		 * boolean bool = false; for (int i = 0; i < tr.length; i++) { if (tr[i]
		 * != null) { bool = true; } else { System.out.println(
		 * "Нет обьектов для вывода"); System.out.println(); } }
		 */
		switch (inputNumber) {

		case 1: {
			boolean bool = false;
			for (int i = 0; i < tr.length; i++) {
				if (tr[i] != null) {
					tr[i].print();
					bool = true;
				}
			}

			if (!bool) {
				System.out.println("Нет обьектов для вывода");
				System.out.println();
				menu12(tr);
				break;
			}
			menu12(tr);
			break;
		}

		case 2: {
			boolean bool = false;
			for (int i = 0; i < tr.length; i++) {
				if (tr[i] != null && tr[i] instanceof CCar) {
					tr[i].print();
					bool = true;
				}
				if (!bool) {
					System.out.println("Автомобиль не создан");
					System.out.println();
					menu12(tr);
					break;
				}
			}
			menu12(tr);
			break;
		}

		case 3: {
			boolean bool = false;
			for (int i = 0; i < tr.length; i++) {
				if (tr[i] != null && tr[i] instanceof CPlane) {
					tr[i].print();
					bool = true;
				}
				if (!bool) {
					System.out.println("Самолет не создан");
					System.out.println();
					menu12(tr);
					break;
				}
			}
			menu12(tr);
			break;
		}

		case 4: {
			boolean bool = false;
			for (int i = 0; i < tr.length; i++) {
				if (tr[i]!= null && tr[i] instanceof CShip) {
					tr[i].print();
					bool = true;
				}
				if (!bool) {
					System.out.println("Корабль не создан");
					System.out.println();
					menu12(tr);
					break;
				}
			}
			menu12(tr);
			break;
		}
		case 0: {
			menu1(tr);
			break;
		}
		}
	}

	public static void main(String[] args) {

		System.out.println("Введите размер массива (количество транспорта)");
		int n = inputInt();
		System.out.println();
		CVehicle[] massTr = new CVehicle[n];

		menu1(massTr);
		sc.close();
	}

}
