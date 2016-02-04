package course02.prj16;

interface SwimAble {
	int swim();
}

public class Car implements SwimAble {

	static class Engine {
		int power;

		public Engine(int p) {
			power = p;
		}

	}

	public Car(int value) {
		this.eng = new Engine(value);
	}

	private Engine eng;

	@Override
	public int swim() {
		// TODO Auto-generated method stub
		return eng.power;
	}

}
