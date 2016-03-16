package course02.prj25;

class NamedRunnable implements Runnable {
	public void run() {
		System.out.println("Запущен " + Thread.currentThread().getName());
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - " + i);
			System.out.flush();
		}
		System.out.println("Закончен " + Thread.currentThread().getName());
	}
}
