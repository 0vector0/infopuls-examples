package course02.prj15pizza;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name = "Chicago Style";
		dough = "Thin Crust dough";
		sauce = "plum sause";
		toppings.add("Mozzarella");
	}
	
	void cut(){
		System.out.println("Cutting ");
	}
}
