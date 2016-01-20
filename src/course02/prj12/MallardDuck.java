package course02.prj12;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Mallard duck");
		// TODO Auto-generated method stub

	}

}
