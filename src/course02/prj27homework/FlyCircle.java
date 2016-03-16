package course02.prj27homework;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class FlyCircle extends JPanel {

	/**
	 * Create the panel.
	 */
	int x;
	int y;

	public FlyCircle() {
		setBorder(new LineBorder(new Color(0, 0, 0), 1));
		this.x = (int) (Math.random() * 100) + 100;
		this.y = (int) (Math.random() * 100) + 100;
		setLayout(null);
		// fly(null);
		// paintComponent(g);
		// this.setBounds(100, 100, 400, 400);
		// this.setSize(300, 300);
		// repaint();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		fly(g);
		// g.fillOval(200, 200, 40, 40);

	}

	void fly(Graphics g) {
		// x = 10;
		// y = 20;
		g.fillOval(x, y, 40, 40);
		// repaint();
	}

}
