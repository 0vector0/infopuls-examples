package course02.prj12.ducks;

import course02.prj12.fly.FlyBehavior;
import course02.prj12.quack.QuackBehavior;
import course02.prj12.turkey.DuckAdapter;

public abstract class Duck implements DuckAdapter {
	
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck(){
	}
	
	public abstract void display();
	
	public void perfomeFly(){
		flyBehavior.fly();
	}
	
	public void perfomeQuack(){
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior ( QuackBehavior qb) {
		quackBehavior = qb;
	}

}
