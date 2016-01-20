package course01.prj11homework;

public class TachkaBetmena extends CCar implements MoveAble, FlyAble {

	public String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void Fly() {
		System.out.println("I belive i can fly");// TODO Auto-generated method stub
		
	}


	@Override
	public void move() {
		System.out.println(getClass().getName() + " едет");
		// TODO Auto-generated method stub
	}

	public TachkaBetmena(String name, int price, int maxSpeed, int year, String color) {
		super(name, price, maxSpeed, year );
		this.color = color;
		
		// TODO Auto-generated constructor stub
	}
	
}
