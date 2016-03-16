package course02.prj25;

public class ThreadStarter {
	public static void main(String[] args) {
		NamedRunnable nr = new NamedRunnable();
		Thread one = new Thread(nr);
		Thread two = new Thread(nr);
		Thread three = new Thread(nr);
		one.setName("Первый");
		two.setName("Второй");
		three.setName("Третий");
		// three.setPriority(Thread.MAX_PRIORITY);
		one.start();
		two.start();
		try {
			two.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		three.start();
		int a = 0;
		System.out.println("Закончен " + (a++) + Thread.currentThread().getName());
		System.out.println("Закончен " + (a++) + Thread.currentThread().getName());
	}
}