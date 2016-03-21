package course02.prj28synchronized;

import java.util.concurrent.Semaphore;

class Q {
	int n;
	boolean valueSet = false;
	static Semaphore semCon = new Semaphore(0);
	static Semaphore semProd = new Semaphore(1);

	int get() {

		try {
			semCon.acquire();
		} catch (InterruptedException е) {
			System.out.println(" Перехвачено исключение типа InterruptedException ");
		}
		System.out.println(" Пoлyчeнo : " + n);
		// while (!valueSet)
		// try {
		// this.wait();
		//
		// } catch (InterruptedException e) {
		// System.out.println("InterruptedException caught");
		// }
		// System.out.println(Thread.currentThread().getName() + " Get: " + n);
		// valueSet = false;
		// notifyAll();
		semProd.release();
		return n;
	}

	void put(int n) {
		try {
			semProd.acquire();
		} catch (InterruptedException e) {
			System.out.println("Перехвачено исключение типа InterruptedException");
		}
		this.n = n;
		System.out.println(" Oтпpaвлeнo : " + n);
		semCon.release();
		// while (valueSet)
		// try {
		// wait();
		// } catch (InterruptedException e) {
		// System.out.println("InterruptedException caught");
		// }
		// this.n = n;
		// valueSet = true;
		// System.out.println(Thread.currentThread().getName() + " Put: " + n);
		// notifyAll();
	}
}

class Producer implements Runnable {
	Q myQ;

	Producer(String name, Q ivanToPetrov) {
		this.myQ = ivanToPetrov;
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
	Q myQ;

	Consumer(String name, Q petrovToNechip) {
		this.myQ = petrovToNechip;
		new Thread(this, name).start();
	}

	public void run() {
		int i = 0;

		while (i < 20) {
			myQ.get();
		}
	}
}

class ProducerConsumer implements Runnable {
	Q in;
	Q out;

	public ProducerConsumer(String name, Q ivanToPetrov, Q petrovToNechip) {
		this.in = ivanToPetrov;
		this.out = petrovToNechip;
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

		Q IvanToPetrov = new Q();
		Q PetrovToNechip = new Q();
		Producer Ivan = new Producer("Ivanov", IvanToPetrov);
		Producer Ivan1 = new Producer("Ivanov1", IvanToPetrov);
		ProducerConsumer Petrov1 = new ProducerConsumer("Petrov1", IvanToPetrov, PetrovToNechip);
		ProducerConsumer Petrov2 = new ProducerConsumer("Petrov2", IvanToPetrov, PetrovToNechip);
		Consumer Nechipor = new Consumer("Nechiporchuk", PetrovToNechip);

	}

}
