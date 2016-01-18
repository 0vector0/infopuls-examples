package prj11homework;

public class CShip extends CVehicle implements SwimAble {

	private String port;
	private int numberOfPassengers;

	public String getPort() {
		return port;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public CShip(String name, int price, int maxSpeed, int year, String port, int numberOfPassengers ) {
		super(name, price, maxSpeed, year );
		this.port = port;
		this.numberOfPassengers = numberOfPassengers;
	}
	
	public CShip() {
		super();
		this.port = inputString("порт приписки");
		this.numberOfPassengers = inputInt("количество пассажиров");
		System.out.println("Корабль создан");
	}
	
	@Override
	protected void print() {
		System.out.println("Корабль");
		super.print();
		System.out.println();
		System.out.print(" Порт приписки - " + port);
		System.out.print(" Количество пассажиров - " + numberOfPassengers);
		System.out.println();

	}

	@Override
	public void swim() {
		System.out.println(getClass().getName() +  "Плывет со скоростбю -" + getMaxSpeed());
		// TODO Auto-generated method stub
		
	}

}
