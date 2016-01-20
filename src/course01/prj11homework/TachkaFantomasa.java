package course01.prj11homework;

public class TachkaFantomasa extends CCar implements MoveAble, SwimAble, FlyAble {

	public String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void Fly() {
		System.out.println("I belive i can fly");
	}

	@Override
	public void swim() {
		System.out.println(getClass().getName() +  "Плывет со скоростбю -" + getMaxSpeed());
	}

	@Override
	public void move() {
		System.out.println(getClass().getName() + " едет");
	}

	public TachkaFantomasa(String name, int price, int maxSpeed, int year, String color) {
		super(name, price, maxSpeed, year);
		this.color = color;
	}

}
