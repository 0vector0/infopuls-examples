package course02.prj29winnie_the_pooh_good_bee;

import java.util.concurrent.CountDownLatch;

public class SleepWinnie implements Runnable {

	Gorshok gorshok;

	public SleepWinnie(Gorshok gorshok) {
		this.gorshok = gorshok;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {

		while (true) {
			gorshok.capacityCountDownLatch = new CountDownLatch(10);
			try {
				gorshok.capacityCountDownLatch.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// gorshok.capacityCountDownLatch = new CountDownLatch(20);

			System.out.println("Выпил" + gorshok.capacityCountDownLatch.getCount());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
