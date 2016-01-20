package course02.prj12.ducks;

import course02.prj12.fly.FlyWithWings;
import course02.prj12.quack.Quack;

public class RedHeadDuck extends Duck {

	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		 quackBehavior= new Quack();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		System.out.println("Я рыжая утка");
		// TODO Auto-generated method stub

	}

}
