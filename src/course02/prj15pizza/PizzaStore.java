package course02.prj15pizza;

public abstract class PizzaStore {

	public Pizza orderPizza(Enum item) {
		
		Pizza pizza;
		
		pizza = createPizza(item);
		
	//	pizza.prepare();
		//pizza.bake();
	//	pizza.cut();
	//	pizza.box();
		
		return pizza;
	}
	
	abstract Pizza createPizza(Enum item);
}
