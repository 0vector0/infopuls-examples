package course02.prj12.ducks;

import course02.prj12.fly.FlyNoWay;
import course02.prj12.quack.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		System.out.println("I'm a real Decoy duck ");
	}

}
