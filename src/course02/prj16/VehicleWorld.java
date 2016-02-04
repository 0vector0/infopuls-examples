package course02.prj16;

public class VehicleWorld {

	public static void main(String[] args) {

		Car bmw = new Car(100);
		SwimAble[] swimMas = new SwimAble[2];
		swimMas[0] = bmw;
		swimMas[1] = new SwimAble() {

			@Override
			public int swim() {
				String name = "Dog";
				// TODO Auto-generated method stub
				return 20;
			}
		};

	}

}
