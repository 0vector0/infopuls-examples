package course01.prj17homework;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Prj17HomeworkPart01 {

	public static void main(String[] args) {

		String[] massStr = new String[10];
		try {
			File file = new File("prj17inPart1.txt");
			Scanner scanner = new Scanner(file /* ,"cp1251" */);
			int i = 0;
			while (scanner.hasNext()) {
				massStr[i] = scanner.nextLine();
				// System.out.println(massStr[i]);
				i++;
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("вывод файла на экран");
		printArray(massStr);

		// task1
		task1(massStr);

		// task2
		task2(massStr);

		// task3
		task3(massStr);

		// task4
		task4(massStr);
	}

	static void printArray(String[] mass) {
		// System.out.println();
		for (int i = 0; i < mass.length; i++) {
			System.out.println(mass[i]);
		}
		// System.out.println();
	}

	static void task1(String[] mass) {

		int minLength = mass[0].length();
		String minStr = mass[0];
		for (int i = 1; i < mass.length; i++) {
			if (mass[i].length() < minLength) {
				minLength = mass[i].length();
				minStr = mass[i];
			}
		}
		System.out.println();
		System.out.println("Task1 - Самая короткая строка");
		System.out.println(minStr);
		System.out.println("Длина строки - " + minStr.length());
	}

	static void task2(String[] mass) {

		System.out.println();
		System.out.println("Task2 - Упорядочить и вывести строки в порядке возрастания их длин,");
		String temp;
		String[] massSort = (String[]) mass.clone();
		for (int i = 0; i < massSort.length - 1; i++) {
			for (int j = 0; j < massSort.length - 1 - i; j++) {
				if (massSort[j].length() > massSort[j + 1].length()) {
					temp = massSort[j];
					massSort[j] = massSort[j + 1];
					massSort[j + 1] = temp;
				}
			}
		}
		printArray(massSort);
	}

	static void task3(String[] mass) {

		double average = 0;
		int sum = 0;
		for (int i = 0; i < mass.length; i++) {
			sum = sum + mass[i].length();
		}
		average = sum / mass.length;
		System.out.println(sum);
		System.out.println();
		System.out.println("Task3 - Вывести на консоль те строки, длина которых меньше средней, также их длины.");
		System.out.println("Средняя длина строк - " + average);
		for (int i = 0; i < mass.length; i++) {
			if (mass[i].length() < (int) average) {
				System.out.print("Длина строки - " + mass[i].length() + " - ");
				System.out.println(mass[i]);
			}
		}
		System.out.println();
	}

	static void task4(String[] mass) {
		int k = 0;
		String sym;
		System.out.println(
				"Task4 - В каждом слове текста k-ю букву заменить заданным символом. Если k больше длины слова, корректировку не выполнять");

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число k");
		System.out.println();
		while (!sc.hasNextInt()) {
			System.out.println("введите число");
			System.out.println(sc.nextLine());
		}
		k = sc.nextInt();
		System.out.println();
		System.out.println("введите символ");
		sc.nextLine();
		sym = sc.nextLine();
		sym = sym.substring(0, 1);

		System.out.println("k = " + k);
		System.out.println("sym = " + sym);
		String[] massTask4 = (String[]) mass.clone();

		ArrayList<String> listAll = new ArrayList<String>();
		StringBuffer strBuffer = new StringBuffer();

		for (int i = 0; i < massTask4.length; i++) {
			ArrayList<String> listTemp = new ArrayList<String>(Arrays.asList(massTask4[i].split(" ")));

			for (int j = 0; j < listTemp.size(); j++) {
				strBuffer = new StringBuffer(listTemp.get(j));

				if (strBuffer.length() >= 5) {
					strBuffer = strBuffer.replace(k - 1, k, sym);
				}
				System.out.print(strBuffer + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
