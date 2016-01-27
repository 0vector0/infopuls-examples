package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToDown implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToDown(ImagePanel imagePanel) {
		super();
		ImagePanel = imagePanel;
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());
		if (rec.y <= 490 - imagePanel.getHeight()) {
			rec.y = rec.y + 5;
		}
		imagePanel.setBounds(rec);
		if (rec.y == 490 - imagePanel.getHeight() ) {
			imagePanel.setImage("dog.png");
			imagePanel.setBounds(rec.x, 300, 300, 300);
		}
	}
}
