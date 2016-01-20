package course02.prj12;

public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
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
