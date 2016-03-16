package course02.prj28synchronized;

class Q {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet)
			try {
				this.wait();

			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		System.out.println(Thread.currentThread().getName() + " Get: " + n);
		valueSet = false;
		notifyAll();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("InterruptedException caught");
			}
		this.n = n;
		valueSet = true;
		System.out.println(Thread.currentThread().getName() + " Put: " + n);
		notifyAll();
	}
}

class Producer implements Runnable {
	MyQ myQ;

	Producer(String name, MyQ myQ) {
		this.myQ = myQ;
		new Thread(this, name).start();
	}

	public void run() {
		int i = 0;

		while (i < 20) {
			myQ.put(i++);
		}
	}
}

class Consumer implements Runnable {
	MyQ myQ;

	Consumer(String name, MyQ myQ) {
		this.myQ = myQ;
		new Thread(this, name).start();
	}

	public void run() {
		while (true) {
			myQ.get();
		}
	}
}

class ProducerConsumer implements Runnable {
	MyQ in;
	MyQ out;

	public ProducerConsumer(String name, MyQ in, MyQ out) {
		this.in = in;
		this.out = out;
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		while (true) {
			out.put(in.get());
		}
	}
}

public class MaxClass {

	public static void main(String[] args) {

		MyQ IvanToPetrov = new MyQ();
		MyQ PetrovToNechip = new MyQ();
		Producer Ivan = new Producer("Ivanov", IvanToPetrov);
		Producer Ivan1 = new Producer("Ivanov1", IvanToPetrov);
		ProducerConsumer Petrov1 = new ProducerConsumer("Petrov1", IvanToPetrov, PetrovToNechip);
		ProducerConsumer Petrov2 = new ProducerConsumer("Petrov2", IvanToPetrov, PetrovToNechip);
		Consumer Nechipor = new Consumer("Nechiporchuk", PetrovToNechip);

	}

}
