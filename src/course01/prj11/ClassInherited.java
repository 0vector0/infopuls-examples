package course01.prj11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

abstract class Human {
	private String fio;

	public String getFio() {
		return fio;
	}

	public void setFio(String fio) {
		this.fio = fio;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private int year;

	public Human(String fio, int year) {
		this.fio = fio;
		this.year = year;
	}

	void eat() {
		System.out.println("eating");
	}

	void sleep() {
		System.out.println("Sleeping");
	}

	abstract void print();

	@Override
	public String toString() {
		return fio + "," + year;
	}

}

class Student extends Human {
	public Student(String fio, int year, int numGroup) {
		super(fio, year);
		this.numGroup = numGroup;

	}

	int numGroup;

	void study() {
		System.out.println("studing");
	}

	@Override
	void print() {
		System.out.println("I'm student");
	}

	@Override
	public String toString() {
		return super.toString() + ", numgroup " + numGroup;
	}
}

class Doctor extends Human {
	public Doctor(String fio, int year, int idLicense) {
		super(fio, year);
		this.idLicense = idLicense;
	}

	int idLicense;

	void cure() {
		System.out.println("cure");
	}

	@Override
	public String toString() {
		return super.toString() + ", idLicense " + idLicense;
	}

	@Override
	void print() {
		System.out.println("I'm doctor");

	}
}

class Voin extends Human {
	public int getNumChasti() {
		return numChasti;
	}

	public void setNumChasti(int numChasti) {
		this.numChasti = numChasti;
	}

	public Voin(String fio, int year, int numChasti) {
		super(fio, year);
		this.numChasti = numChasti;
	}

	int numChasti;

	void fight() {
		System.out.println("fight");
	}

	@Override
	public String toString() {
		return super.toString() + ", numChasti " + numChasti;
	}

	@Override
	void print() {
		System.out.println("I'm voin");

	}
}

class StudentZao extends Student {
	public StudentZao(String fio, int year, int numGroup, int sesyaZao) {
		super(fio, year, numGroup);
		this.sesyaZao = sesyaZao;
	}

	int sesyaZao;
}

public class ClassInherited {

	// чтение из файла
	static public String[] strFromFile() {

		String[] name = new String[10];
		int count = 0;
		try {
			Scanner sc = new Scanner(new File("name.txt"));
			while (sc.hasNextLine()) {
				name[count] = sc.nextLine();
				count++;
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name;

	}

	// Фабричный метод (патерн)
	static public Human randHuman() {

		// чтение имен и файла
		String[] name = strFromFile();
		// генерация варианта human
		int r = (int) (Math.random() * 4);
		// случайное имя
		String nameHuman = name[(int) (Math.random() * 10)];
		// случайный год
		int yearHuman = 1900 + ((int) Math.random() * 100);

		switch (r) {
		case 0:
			return new Student("Student " + nameHuman, yearHuman, 3);
		case 1:
			return new StudentZao("StudentZao " + nameHuman, yearHuman, 1, 2);
		case 2:
			return new Doctor("Doctor " + nameHuman, yearHuman, 9999);
		case 3:
			return new Voin("Voin " + nameHuman, yearHuman, 333);
		default:
			return null;
		}
	}

	public static void main(String[] args) {

		Student st = new Student(null, 2005, 10);
		st.setFio("Vasiliy");
		System.out.println(st.getFio());

		Doctor doc = new Doctor("AyBolit", 1800, 1);

		Voin soldier = new Voin("Rembo", 2000, 9999);

		System.out.println(st.toString());
		System.out.println(doc.toString());
		System.out.println(soldier.toString());

		// doctora rabota nad masivon odnotipnih classov
		Doctor[] policlinika = new Doctor[5];
		policlinika[0] = new Doctor("Maria", 1999, 76765);
		policlinika[1] = new Doctor("Petovich", 423, 32);
		policlinika[4] = new Doctor("Ivanov", 654, 325);

		Doctor maxLicenseDoc = policlinika[0];

		for (int i = 0; i < policlinika.length; i++) {
			if (policlinika[i] != null) {
				if (maxLicenseDoc.idLicense < policlinika[i].idLicense) {
					maxLicenseDoc = policlinika[i];
				}
			}
		}
		System.out.println(maxLicenseDoc);

		Human doc1 = new Doctor("AyBolit1", 1800, 1);
		Human soldier1 = new Voin("Rembo1", 2000, 9999);

		// Восходящее преобразование
		System.out.println();
		System.out.println("Humans");

		Human[] people = new Human[6];

		/*
		 * people[0] = st; people[1] = doc1; people[2] = doc; people[3] =
		 * soldier1; people[4] = new Doctor("Okulist", 2002, 432); people[5] =
		 * new StudentZao("StudentZao", 43432, 543, 534);
		 */

		for (int i = 0; i < people.length; i++) {
			people[i] = randHuman();
		}

		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].toString());
		}
		// System.out.println("14.12.2015");
		// System.out.println();

		Doctor[] massDoc = new Doctor[3];
		Voin[] massVoin = new Voin[3];

		int countStudent = 0;
		int countStudentZao = 0;
		int countDoctod = 0;
		int countVoin = 0;
		for (int i = 0; i < people.length; i++) {
			if (people[i] instanceof StudentZao) {
				countStudentZao++;
			} else if (people[i] instanceof Student) {
				countStudent++;
				System.out.println(((Student) people[i]).numGroup);
			}
			if (people[i] instanceof Doctor) {

				massDoc[countDoctod] = (Doctor) people[i];
				System.out.println(((Doctor) people[i]).idLicense);
				countDoctod++;
			}
			if (people[i] instanceof Voin) {
				massVoin[countVoin] = (Voin) people[i];
				System.out.println(((Voin) people[i]).numChasti);
				countVoin++;
			}
		}

		System.out.println("countStudentZao = " + countStudentZao);
		System.out.println("countStudent = " + countStudent);
		System.out.println("countDoctod = " + countDoctod);
		System.out.println("countVoin = " + countVoin);
	}
}
