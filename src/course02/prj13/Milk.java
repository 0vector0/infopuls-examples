package course02.prj13;

public class Milk extends CondimentDecorator {
	Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + " ,Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + 1.99;
	}

}
