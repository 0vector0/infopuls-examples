package course02.prj29winnie_the_pooh;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Winnie implements Runnable {

	private volatile JPanel panel;
	private int x;
	private int y;
	private boolean bitten;

	public Winnie(JPanel panel) {
		this.panel = panel;
		x = 250;
		y = 250;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	void go() throws InterruptedException {
		int count = 0;
		int maxCount = 100;
		int direction = (int) (Math.random() * 4) + 1;
		while (count < 5 && !bitten) {
			switch (direction) {
			case 1:
				Thread.sleep(5);
				x = x + 10;
				if (x > 480) {
					count = maxCount;
					break;
				}
				paint(panel.getGraphics());
				count++;
				break;
			case 2:
				Thread.sleep(5);
				x = x - 10;
				if (x < 20) {
					count = maxCount;
					break;
				}
				paint(panel.getGraphics());
				count++;
				break;
			case 3:
				Thread.sleep(5);
				y = y + 10;
				if (y > 480) {
					count = maxCount;
					break;
				}
				paint(panel.getGraphics());
				count++;
				break;
			case 4:
				Thread.sleep(5);
				y = y - 10;
				if (y < 20) {
					count = maxCount;
					break;
				}
				paint(panel.getGraphics());
				count++;
				break;
			default:
				break;
			}
		}
	}

	public boolean isBitten() {
		return bitten;
	}

	synchronized private void paint(Graphics g) throws InterruptedException {
		g.setColor(new Color(100, 70, 0));
		g.fillRect(x, y, 10, 10);
		Thread.sleep(500);
		panel.repaint();
	}

	@Override
	public void run() {
		while (!bitten) {
			try {
				go();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
	}

	public void setBitten(boolean bitten) {
		this.bitten = bitten;
	}
}
