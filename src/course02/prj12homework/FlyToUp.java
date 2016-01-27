package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToUp implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToUp(ImagePanel imagePanel) {
		super();
		ImagePanel = imagePanel;
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		// int x = 0;
		// int y = 0;
		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());
		if (rec.y > 0) {
			// rec.x = rec.x + 1;
			rec.y = rec.y - 5;

			imagePanel.setBounds(rec);

			System.out.println("Fly to up!!!!");
		}
	}

}
