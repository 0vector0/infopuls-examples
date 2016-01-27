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

		ImagePanel = imagePanel;
		
		Rectangle rec = new Rectangle(imagePanel.getBounds());
		if (rec.y > 0) {
			rec.y = rec.y - 5;
			imagePanel.setBounds(rec);
		}
	}
}
