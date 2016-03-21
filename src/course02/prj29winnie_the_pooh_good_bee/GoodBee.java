package course02.prj29winnie_the_pooh_good_bee;

public class GoodBee implements Runnable {

	Gorshok gorshok;

	public GoodBee(Gorshok gorshok) {
		this.gorshok = gorshok;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			gorshok.capacityCountDownLatch.countDown();
			System.out.println("Горшок " + gorshok.capacityCountDownLatch.getCount());
			// if (gorshok.capacityCountDownLatch.getCount() == 0) {
			// gorshok.semWinnie.release();
			// }
		}
	}
}
