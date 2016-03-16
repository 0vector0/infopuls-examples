package course02.prj28synchronized;

public class Petrov implements Runnable {

	MyQ in;
	MyQ out;

	public Petrov(MyQ in, MyQ out) {
		this.in = in;
		this.out = out;
		new Thread(this, "Петров").start();
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("Петров забрал");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Петров поклал");
			out.put(in.get());

		}
	}

}
