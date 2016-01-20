package course02.prj12.ducks;

import course02.prj12.fly.FlyNoWay;
import course02.prj12.quack.Quack;

public class ModelDuck extends Duck {
 public ModelDuck() {
	 flyBehavior = new FlyNoWay();
	 quackBehavior = new Quack();
	// TODO Auto-generated constructor stub
}

@Override
public void display() {
	System.out.println("Я модель утки");
	// TODO Auto-generated method stub
	
}
	
}
