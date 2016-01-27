

package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToDownRight extends FlyToRight implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToDownRight(ImagePanel imagePanel) {
		super(imagePanel);
		ImagePanel = imagePanel;
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x < 700 - imagePanel.getWidth() && rec.y < 500 - imagePanel.getHeight()) {
			rec.x = rec.x + 5;
			rec.y = rec.y + 5;
			changeImage(imagePanel);
			imagePanel.setBounds(rec);
		}
	}
}
