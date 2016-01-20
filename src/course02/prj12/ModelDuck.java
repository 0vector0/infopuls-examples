package course02.prj12;

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
