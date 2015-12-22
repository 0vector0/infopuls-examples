package course01.prj10homework;

//import java.util.Scanner;

public class Univer {

	public static void main(String[] args) {

		Group groupJava = new Group();
		groupJava.inputGrades();
		// groupJava.sortByAverageGrade();
		System.out.println("Информация о студентах упорядоченная по среднему баллу");
		groupJava.printStudentByAverageGrade();
		System.out.println("Студенты у которых оценки 4 или 5");
		groupJava.printGoodStudent();
	}

}
