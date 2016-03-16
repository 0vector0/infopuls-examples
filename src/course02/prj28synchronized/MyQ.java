package course02.prj28synchronized;

public class MyQ {

	int n;
	boolean valueSet = false;

	synchronized int get() {
		while (!valueSet)
			try {
				wait();
			} catch (InterruptedException е) {
				System.out.println("Исключение типа InterruptedException перехвачено ");
			}
		System.out.println("Пoлyчeнo Q : " + n);
		valueSet = false;
		notifyAll();
		// notify();
		return n;
	}

	synchronized void put(int n) {
		while (valueSet)
			try {
				wait();
			} catch (InterruptedException е) {
				System.out.println("Исключение типа InterruptedException on перехвачено ");
			}
		this.n = n;
		valueSet = true;
		System.out.println("Oтпpaвлeнo Q : " + n);
		notifyAll();
		// notify();
	}

}
