package course01.prj10homework;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Group {

	private int groupNumber;
	private int quantityStudents;
	private Student[] groupStudent;

	Scanner sc = new Scanner(System.in);
	
	Group() {
		setGroupName();
		setQuantityStudents();
		this.groupStudent = new Student[this.quantityStudents];
		inputDataStudent();
	}

	private void setGroupName() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Введите номер группы");
		while (!sc.hasNextInt()) {
			System.out.println("Веедите число");
			sc.nextLine();
		}
		this.groupNumber = sc.nextInt();
		// sc.close();
	}

	private void setQuantityStudents() {
		
		System.out.println("Введите количество студентов");
		while (!sc.hasNextInt()) {
			System.out.println("Введите число");
			sc.nextLine();
		}
		this.quantityStudents = sc.nextInt();
	}

	private void inputDataStudent() {
		for (int i = 0; i < groupStudent.length; i++) {
			groupStudent[i] = new Student(groupNumber, i);
		}
	}

	public void inputGrades() {
		for (int i = 0; i < groupStudent.length; i++) {
			groupStudent[i].setGrades();
		}
	}

	public void sortByAverageGrade() {
		Arrays.sort(groupStudent);
	}

	public void printStudentByAverageGrade() {
		sortByAverageGrade();
		for (int i = 0; i < groupStudent.length; i++) {
			System.out.print("Группа - " + groupStudent[i].getGroupNumber());
			System.out.print(" Студент - " + groupStudent[i].getFio());
			System.out.println(" Средний бал " + groupStudent[i].getAverageGrade());
		}
	}

	public void printGoodStudent() {
		boolean bool = false;
		for (int i = 0; i < groupStudent.length; i++) {

			if (groupStudent[i].Grade4And5()) {
				System.out.print("Группа - " + groupStudent[i].getGroupNumber());
				System.out.print(" Студент - " + groupStudent[i].getFio());
				System.out.println(" Средний бал " + groupStudent[i].getAverageGrade());
				bool = true;
			}

		}
		if (!bool) {
			System.out.println("Таких студетов нет");
		}
	}
}
