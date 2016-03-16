package course02.prj29winnie_the_pooh;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Bee implements Runnable {

	private volatile JPanel panel;
	private Winnie winnie;
	private int x;
	private int y;
	private Hive hive;
	private int speed;
	// private boolean end = false;

	public Bee(JPanel panel, Winnie winnie, int y, Hive hive) {
		this.panel = panel;
		this.winnie = winnie;
		this.x = 0;
		this.y = y;
		this.hive = hive;
		speed = (int) (Math.random() * 100) + 50;
		// speed = 50;
		// System.out.println(speed);

		// System.out.println(panel.getWidth());
		// System.out.println(panel.getHeight());
	}

	synchronized private void blink(Graphics g) {
		while (true) {
			g.setColor(Color.RED);
			g.fillRect(x, y, 10, 10);
		}
	}

	synchronized private void paint(Graphics g) {
		g.setColor(new Color(255, 170, 0));
		// x = (int) ((panel.getWidth() - 10) * Math.random());
		// y = (int) ((panel.getHeight() - 10) * Math.random());

		g.fillRect(x, y, 10, 10);
		if (x != panel.getWidth()) {
			g.setColor(Color.green);
			g.fillRect(x - 10, y, 10, 10);
		} else {
			g.setColor(Color.green);
			g.fillRect(panel.getWidth() - 10, y, 10, 10);

		}
	}

	@Override
	public void run() {

		while (!hive.isFound()) {
			while (x != panel.getWidth()) {
				paint(panel.getGraphics());
				search(winnie);
				if (hive.isFound()) {
					blink(panel.getGraphics());
				}
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				x = x + 10;
			}
			paint(panel.getGraphics());
			// end = true;
			System.out.println("готово");
			x = 0;
			if (hive.getCount() == 490) {
				y = 0;
				// System.out.println("y = 0");
				// hive.count = y;
			} else {
				y = hive.getCount() + 10;
			}
			hive.setCount(y);
		}

	}

	synchronized public void search(Winnie winnie) {
		if (winnie.getX() == x && winnie.getY() == y) {
			hive.setFound(true);
			// System.out.println("Found");
		}
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

}
