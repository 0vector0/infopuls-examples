package course02.prj21LinkList;

public class Bus {

	int numberBus;
	String fio;
	int numberM;

	public Bus(int numberBus) {
		// numberBus = (int) (Math.random() * 10) + 200;
		this.numberBus = numberBus;
		fio = "fio " + numberBus;
		numberM = (int) (Math.random() * 100) + 1000;
	}
}
