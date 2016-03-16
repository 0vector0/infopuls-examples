package course02.prj28synchronized;

public class Ivanov implements Runnable {

	MyQ q1;

	public Ivanov(MyQ q1) {
		this.q1 = q1;
		new Thread(this, "Иванов").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			System.out.println("Иванов put");
			q1.put(i++);
		}
	}
}
