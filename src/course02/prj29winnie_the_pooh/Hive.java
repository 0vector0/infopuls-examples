package course02.prj29winnie_the_pooh;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Hive implements Runnable {

	private volatile JPanel panel;
	private volatile JLabel label;
	private Winnie winnie;
	private volatile int count = 0;

	private volatile boolean found = false;

	// private boolean bool = false;

	public Hive(JPanel panel, JLabel label, Winnie winnie) {
		this.panel = panel;
		this.label = label;
		this.winnie = winnie;
	}

	public int getCount() {
		return count;
	}

	public boolean isFound() {
		return found;
	}

	@Override
	synchronized public void run() {

		for (int i = 0; i < 1; i++) {
			new Thread(new Bee(panel, winnie, count, this)).start();
			count = count + 10;
		}
		while (!found) {
			if (found) {
				System.out.println("FOUND");
				label.setText("Медведь наказан");
				winnie.setBitten(true);
				break;
			}
		}

	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setFound(boolean found) {
		this.found = found;
	}

}
