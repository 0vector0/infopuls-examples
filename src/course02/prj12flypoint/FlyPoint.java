package course02.prj12flypoint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

class MyPanel extends JPanel {
	int x;
	int y;

	void fly(Graphics g) {
		if (x > 150 && y > 150) {
			g.setColor(Color.BLACK);
		} else {
			g.setColor(Color.RED);
		}

		g.fillRect(x + 50, y + 50, 10, 10);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		fly(g);
	}
}

class MyFrame extends JFrame {
	MyPanel mp;

	public MyFrame() {
		this.setLocation(200, 100);
		this.setMinimumSize(new Dimension(600, 400));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		mp = new MyPanel();
		this.getContentPane().add(mp);
		this.pack();
		this.setVisible(true);

	}
}

public class FlyPoint {

	public static void main(String[] args) throws InterruptedException {
		MyFrame mf = new MyFrame();
		for (int i = 0; i < 100; i++) {
			mf.mp.x = i;
			mf.mp.y = i;

			Thread.sleep(100);
			mf.repaint();
		}
	}

}
