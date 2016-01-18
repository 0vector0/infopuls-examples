package prj11homework;

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
		System.out.println("I belive i can fly");// TODO Auto-generated method
													// stub

	}

	@Override
	public void swim() {
		System.out.println(getClass().getName() +  "Плывет со скоростбю -" + getMaxSpeed());
		
		// TODO Auto-generated method stub

	}

	@Override
	public void move() {
		System.out.println(getClass().getName() + " едет");
		// TODO Auto-generated method stub
	}

	public TachkaFantomasa(String name, int price, int maxSpeed, int year, String color) {
		super(name, price, maxSpeed, year);
		this.color = color;

		// TODO Auto-generated constructor stub
	}


}
