package course02.prj28synchronized;

import java.util.concurrent.Semaphore;

public class MyQ {

	int n;
	// boolean valueSet = false;

	// 1 1 начать с недоступного семафора потребителя
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
		// wait();
		// } catch (InterruptedException е) {
		// System.out.println("Исключение типа InterruptedException перехвачено
		// ");
		// }
		// System.out.println("Пoлyчeнo Q : " + n);
		// valueSet = false;
		// notifyAll();
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
		// } catch (InterruptedException е) {
		// System.out.println("Исключение типа InterruptedException on
		// перехвачено ");
		// }
		// this.n = n;
		// valueSet = true;
		// System.out.println("Oтпpaвлeнo Q : " + n);
		// notifyAll();
		// notify();
	}

}
