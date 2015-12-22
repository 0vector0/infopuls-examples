package course01.prj09homework;

//Класс Product содержит поля
//-тип продукта(фрукты, овощи, бытовая химия, техника)
//-наименование(яблоки, бананы, компьютер, телефон)
//-вес
//-цена 
public class Product {

	private String type;
	private String name;
	private double weight = 0;
	private double price = 0;

	Product(String type, String name, double weight, double price) {
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	static void printHat() {
		System.out.printf("%-14s|", "тип продукта");
		System.out.printf("%-13s|", "наименование");
		System.out.printf("%-6s|", "вес");
		System.out.printf("%-6s%n", "цена");
	}
	
	static void prinItem(Product massOfProduct[], int i) {
		System.out.printf("%-14s|", massOfProduct[i].type);
		System.out.printf("%-13s|", massOfProduct[i].name);
		System.out.printf("%-6.2f|", massOfProduct[i].weight);
		System.out.printf("%-6.2f%n", massOfProduct[i].price);
	}
	
	static void printArray(Product massOfProduct[]) {

		for (int i = 0; i < massOfProduct.length; i++) {
			prinItem(massOfProduct, i);
		}
	}

	// 1) Найти с максимальным весом
	static void maxWeight(Product massOfProduct[]) {

		double maxWeight = 0;
		int count = 0;

		for (int i = 0; i < massOfProduct.length; i++) {
			if (massOfProduct[i].weight > maxWeight) {
				maxWeight = massOfProduct[i].weight;
				count = i;
			}
		}
		prinItem(massOfProduct, count);
	}

	// 2) Найти с максимальной ценой
	static void maxPrice(Product massOfProduct[]) {

		double maxPrice = 0;
		int count = 0;

		for (int i = 0; i < massOfProduct.length; i++) {
			if (massOfProduct[i].price > maxPrice) {
				maxPrice = massOfProduct[i].price;
				count = i;
			}
		}
		prinItem(massOfProduct, count);
	}

	// 3) Найти с общий вес всех продуктов
	public static double sumWeight(Product massOfProduct[]) {
		
		double sum = 0;
		
		for (int i = 0; i < massOfProduct.length; i++) {
			sum = sum + massOfProduct[i].weight;
		}
		return sum;
	}

	// 4) Найти с общую стоимость всех продуктов
	static double sumPrice(Product massOfProduct[]) {
		
		double sum = 0;
		
		for (int i = 0; i < massOfProduct.length; i++) {
			sum = sum + massOfProduct[i].price;
		}
		return sum;
	}

	// 5) Найти все яблоки
	static void apples(Product massOfProduct[], String item) {

		for (int i = 0; i < massOfProduct.length; i++) {
			if (massOfProduct[i].name.equals(item)) {
				prinItem(massOfProduct, i);
			}
		}
	}

	// 6) Найти яблоки с максимальной ценой
	static void applesMaxPrice(Product massOfProduct[]) {
		double maxPrice = 0;
		int count = 0;

		for (int i = 0; i < massOfProduct.length; i++) {
			if (massOfProduct[i].name.equals("яблоко")) {
				if (massOfProduct[i].price > maxPrice) {
					maxPrice = massOfProduct[i].price;
					count = i;
				}
			}
		}
		prinItem(massOfProduct, count);
	}

	// 7) Найти всю технику
	static void technic(Product massOfProduct[], String item) {
		for (int i = 0; i < massOfProduct.length; i++) {
			if (massOfProduct[i].type.equals(item)) {
				prinItem(massOfProduct, i);
			}
		}
	}

	// 8) Найти среднюю стоимость овощей
	static double averagePriceOfVegetables(Product massOfProduct[], String item) {
		double average = 0;
		double sum = 0;
		int count = 0;
		for (int i = 0; i < massOfProduct.length; i++) {
			if (massOfProduct[i].type.equals(item)) {
				sum = sum + massOfProduct[i].price;
				count++;
			}
		}
		average = sum / count;
		return average;
	}
}
