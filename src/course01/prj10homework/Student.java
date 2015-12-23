package course01.prj10homework;

import java.util.Scanner;

public class Student implements Comparable {

	
	Scanner sc = new Scanner(System.in);
	
	private String fio;

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	private int groupNumber;

	public int getGroupNumber() {
		return groupNumber;
	}

	private int[] grades;
	private double averageGrade;

	public double getAverageGrade() {
		average();
		return averageGrade;
	}

	private int numberOfStudent;

	 Student(int groupNumber, int numberOfStudent) {
		//Scanner sc = new Scanner(System.in);
		this.groupNumber = groupNumber;
		this.numberOfStudent = numberOfStudent;
		System.out.println("Enter fio student " + numberOfStudent);
		this.fio = sc.nextLine();
		this.grades = new int[5];
		// sc.close();
	}

	public void setGrades() {
		//Scanner sc = new Scanner(System.in);
		System.out.println("Введите оценки студента " + this.fio);
		for (int i = 0; i < grades.length; i++) {

			int tempGrade = 0;
			while (true) {
				while (!sc.hasNextInt()) {
					System.out.println("Введите число");
					sc.nextLine();
				}
				tempGrade = sc.nextInt();
				if (tempGrade > 0 && tempGrade <= 5) {
					break;
				}
				System.out.println("Оценка может быть > 0 и < 5");
			}
			grades[i] = tempGrade;
		}
		average();
		System.out.println("Средний бал студента " + this.fio + " - " + this.averageGrade);
	}

	void average() {
		double sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum = sum + grades[i];
		}
		this.averageGrade = sum / this.grades.length;
	}

	public int compareTo(Object obj) {
		Student tmp = (Student) obj;
		if (this.averageGrade < tmp.averageGrade) {
			/* текущее меньше полученного */
			return -1;
		} else if (this.averageGrade > tmp.averageGrade) {
			/* текущее больше полученного */
			return 1;
		}
		/* текущее равно полученному */
		return 0;
	}
	
	public boolean Grade4And5(){
		
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] == 4 || grades[i] == 5) {
				return true;
			}
		}
		return false;
	}
	
}
