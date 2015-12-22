package course01.prj09homework;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// -тип продукта(фрукты, овощи, бытовая химия, техника)
		// -наименование(яблоки, бананы, компьютер, телефон)
		// -вес
		// -цена

		Product[] massOfProduct = new Product[10];
		massOfProduct[0] = new Product("фрукт", "яблоко", 1.4, 12.50);
		massOfProduct[1] = new Product("фрукт", "яблоко", 2.4, 22.50);
		massOfProduct[2] = new Product("фрукт", "апельсин", 0.24, 33.45);
		massOfProduct[3] = new Product("овощь", "огурец", 5, 4.50);
		massOfProduct[4] = new Product("овощь", "помидор", 3, 33.25);
		massOfProduct[5] = new Product("овощь", "картошка", 22, 3.55);
		massOfProduct[6] = new Product("бытовая химия", "шампунь", 0.5, 45);
		massOfProduct[7] = new Product("бытовая химия", "Domestos", 0.5, 88.50);
		massOfProduct[8] = new Product("техника", "телефон", 0.1, 599.99);
		massOfProduct[9] = new Product("техника", "компьютер", 2.1, 12000);

		Product.printHat();
		Product.printArray(massOfProduct);

		// task1
		System.out.println();
		System.out.println("1) Найти с максимальным весом");
		Product.printHat();
		Product.maxWeight(massOfProduct);

		// task2
		System.out.println();
		System.out.println("2) Найти с максимальной ценой");
		Product.printHat();
		Product.maxPrice(massOfProduct);

		// 3) Найти с общий вес всех продуктов
		System.out.println();
		System.out.print("3) Найти с общий вес всех продуктов - ");
		System.out.printf("%.2f%n", Product.sumWeight(massOfProduct));

		// 4) Найти с общую стоимость всех продуктов
		System.out.println();
		System.out.print("4) Найти с общую стоимость всех продуктов - ");
		System.out.printf("%.2f%n", Product.sumPrice(massOfProduct));

		// 5) Найти все яблоки
		System.out.println();
		System.out.println("5) Найти все яблоки");
		Product.apples(massOfProduct, "яблоко");

		// 6) Найти яблоки с максимальной ценой
		System.out.println();
		System.out.println("6) Найти яблоки с максимальной ценой");
		Product.applesMaxPrice((massOfProduct));

		// 7) Найти всю технику
		System.out.println();
		System.out.println("7) Найти всю технику");
		Product.technic(massOfProduct, "техника");

		// 8) Найти среднюю стоимость овощей
		System.out.println();
		System.out.print("8) Найти среднюю стоимость овощей - ");
		System.out.printf("%.2f%n", Product.averagePriceOfVegetables(massOfProduct, "овощь"));

	}
}
