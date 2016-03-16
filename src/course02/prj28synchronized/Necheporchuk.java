package course02.prj28synchronized;

public class Necheporchuk implements Runnable {
	MyQ q2;

	public Necheporchuk(MyQ q2) {
		this.q2 = q2;
		new Thread(this, "Нечепорчук").start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Нечепорчук get");
			q2.get();

		}
	}
}
