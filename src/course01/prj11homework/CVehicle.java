package course01.prj11homework;

import java.util.Scanner;

public abstract class CVehicle {

	private static Scanner sc = new Scanner(System.in);

	//static String strName = "название";
	//static String strPrice = "цену";
	//static String strMaxSpeed = "максимальную скорость";
	//static String strYear = "год выпуска";
	// static String strHight = "максимальную высоту полета";
	// static String strNumberOfPassengers = "количество пассажиров";
	// static String strPort = "порт приписки";

	private String name;

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public int getYear() {
		return year;
	}

	private int price;
	private int maxSpeed;
	private int year;

	public CVehicle( String name, int price, int maxSpeed, int year ) {
		this.name = name;
		this.price = price;
		this.maxSpeed = maxSpeed;
		this.year = year;
	}
	
	public CVehicle(/* String name, int price, int maxSpeed, int year */) {
		System.out.println("Введите параметры транспорного средства");
		this.name = inputString("название");
		this.price = inputInt("цену");
		this.maxSpeed = inputInt("максимальную скорость");
		this.year = inputInt("год выпуска");
	}

	protected void print() {
		System.out.print("Транспорное средство - " + name);
		System.out.print( "Цена - " + price);
		System.out.print(" Максимальная скорость - " + maxSpeed);
		System.out.print(" Год выпуска - " + year);
	}

	protected static int inputInt(String description) {

		System.out.println("Введите " + description + " (число)");
		while (!sc.hasNextInt()) {
			System.out.println("число");
			sc.nextLine();
		}
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}

	protected static String inputString(String description) {
		System.out.println("Введите " + description);
		String result = sc.nextLine();
		System.out.println();
		return result;
	}

}
