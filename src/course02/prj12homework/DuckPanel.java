package course02.prj12homework;

import java.awt.Rectangle;

public class DuckPanel extends ImagePanel {

	/**
	 * Create the panel.
	 */
	DuckPanel duckPanel;
	int count = 0;

	public DuckPanel() {
		super();
		flyBehaviorHome = new FlyToRight(this);
		setFileName("right1.png");
	}

	public void flyDuck(DuckPanel duckPanel) {

		this.duckPanel = duckPanel;
		Rectangle rec = new Rectangle(duckPanel.getBounds());
		flyRandomDuck(duckPanel);
		if (rec.x == 700 - duckPanel.getWidth()) {
			flyBehaviorHome = new FlyToLeft(this);
			perfomeFly(this);
		} else {
			if (rec.x == 0) {
				flyBehaviorHome = new FlyToRight(this);
				perfomeFly(this);
			} else {
				if (rec.y == 0) {
					flyBehaviorHome = new FlyToDownLeft(this);
					perfomeFly(this);
				} else {
					if (rec.y == 500 - duckPanel.getHeight()) {
						flyBehaviorHome = new FlyToUpLeft(this);
						perfomeFly(this);
					} else {
						flyRandomDuck(duckPanel);
					}
				}
			}
		}

	}

	public void flyRandomDuck(DuckPanel duckPanel) {

		if (count < 10) {
			perfomeFly(this);
			count++;
		} else {
			int random = (int) (Math.random() * 6) + 1;
			System.out.println(random);
			count = 0;
			switch (random) {
			case 1:
				// flyBehaviorHome = new FlyToRight(this);
				// perfomeFly(this);
				break;
			case 2:
				flyBehaviorHome = new FlyToUpRight(this);
				perfomeFly(this);
				break;
			case 3:
				flyBehaviorHome = new FlyToDownRight(this);
				perfomeFly(this);
				break;
			case 4:
				flyBehaviorHome = new FlyToLeft(this);
				perfomeFly(this);
				break;
			case 5:
				flyBehaviorHome = new FlyToUpLeft(this);
				perfomeFly(this);
				break;
			case 6:
				flyBehaviorHome = new FlyToDownLeft(this);
				perfomeFly(this);
				break;
			default:
				break;
			}
		}
	}

	public void flyDeathDuck(DuckPanel duckPanel) {

		flyBehaviorHome = new FlyToDown(duckPanel);
		perfomeFly(this);
	}

}
