package course02.prj29winnie_the_pooh_good_bee;

public class MainWinnie {

	public static void main(String[] args) {

		Gorshok gorshok = new Gorshok();
		new Thread(new SleepWinnie(gorshok)).start();
		new Thread(new GoodBee(gorshok)).start();
		// new Thread(new GoodBee(gorshok)).start();
		// new Thread(new GoodBee(gorshok)).start();

	}

}
