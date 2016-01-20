package course01.prj11homework;

public class CPlane extends CVehicle {
	
	
	private int hight;
	private int numberOfPassengers;
	
	public int getHight() {
		return hight;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public CPlane() {
		super();
		this.hight = inputInt("максимальную высоту полета");
		this.numberOfPassengers = inputInt("количество пассажиров");
		System.out.println("Самолет создан");
		
	}
	
	@Override
	protected void print() {
		System.out.println("Самолет");
		super.print();
		System.out.println();
		System.out.print(" Максимальная высота - " + hight);
		System.out.print(" Количество пассажиров - " + numberOfPassengers);
		System.out.println();
		
		
	}

}
