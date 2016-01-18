package prj11homework;

public class CCar extends CVehicle implements MoveAble {

	public CCar() {
		super();
	
		System.out.println("Автомобиль создан");
	}
	
	public CCar(String name, int price, int maxSpeed, int year ) {
		super(name, price, maxSpeed, year );
	}
	@Override
	public  void print() {
		System.out.println("Автомобиль");
		super.print();
		System.out.println();
	}

	@Override
	public void move() {
		System.out.println(getClass().getName() + " едет");
		
		// TODO Auto-generated method stub
		
	}
	

}
