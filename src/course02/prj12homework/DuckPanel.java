package course02.prj12homework;

public class DuckPanel extends ImagePanel {

	/**
	 * Create the panel.
	 */

	int count = 0;

	public DuckPanel() {
		super();
		flyBehaviorHome = new FlyToRight(this);
	}

	public void flyDuck(DuckPanel duckPanel) {



		if (count < 10) {
			perfomeFly(this);
			count++;
		} else {
			int random = (int) (Math.random() * 4) + 1;

			System.out.println(random);
			count = 0;
			switch (random) {
			case 1:
				flyBehaviorHome = new FlyToRight(this);
				perfomeFly(this);
				break;
			case 2:
				flyBehaviorHome = new FlyToLeft(this);
				perfomeFly(this);
				break;
			case 3:
				flyBehaviorHome = new FlyToUp(this);
				perfomeFly(this);
				break;
			case 4:
				flyBehaviorHome = new FlyToDown(this);
				perfomeFly(this);
				break;
			default:
				break;
			}
		}
		// flyBehaviorHome = new FlyToRight(this);
		// perfomeFly(this);

	}

}
