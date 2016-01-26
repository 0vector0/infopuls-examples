package course02.prj13;

public class StarbuzzCoffee {

	public static void main(String[] args) {

		Beverage coffee1 = new Espresso();
		System.out.println(printBeverage(coffee1));

		Beverage capuchino = new Espresso();
		capuchino = new Milk(new Mocha(capuchino));
		System.out.println(printBeverage(capuchino));

		Beverage coffeeWhithMilk = new Espresso();
		coffeeWhithMilk = new Milk(coffeeWhithMilk);
		System.out.println(printBeverage(coffeeWhithMilk));

	}

	static String printBeverage(Beverage beverage) {
		return beverage.getDescription() + " - $" + beverage.cost();
	}

}
