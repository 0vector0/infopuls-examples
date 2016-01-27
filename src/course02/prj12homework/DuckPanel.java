package course02.prj12homework;


public class DuckPanel extends ImagePanel {

	/**
	 * Create the panel.
	 */
	public DuckPanel() {
		super();
		flyBehaviorHome = new FlyToRight(this);
	}

	public void flyDuck(DuckPanel duckPanel) {


		int random = (int) (Math.random() * 4) + 1;

		System.out.println(random);

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

		// flyBehaviorHome = new FlyToRight(this);
		// perfomeFly(this);


	}


}
