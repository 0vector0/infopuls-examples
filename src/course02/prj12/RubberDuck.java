package course02.prj12;

public class RubberDuck extends Duck {

	
	public RubberDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("Я резиновая утка");
	}

}
