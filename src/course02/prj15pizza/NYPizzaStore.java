package course02.prj15pizza;

public class NYPizzaStore extends PizzaStore {

	//Enum item;
	
	Pizza createPizza(Enum item) {
		if (true) {
			
			return new NYStyleCheesePizza();
		} else {
			if (item.equals("veggie")) {
				return null;
			}

			else {
				if (item.equals("clam")) {
					return null;
				}

				else {
					if (item.equals("pepperoni")) {
						return null;
					}
				}
			}
		}
		return null;
	}

}
