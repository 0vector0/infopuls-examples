

package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToDownLeft extends FlyToLeft implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToDownLeft(ImagePanel imagePanel) {
		super(imagePanel);
		ImagePanel = imagePanel;
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x > 0 && rec.y < 500 - imagePanel.getHeight()) {
			rec.x = rec.x - 5;
			rec.y = rec.y + 5;
			changeImage(imagePanel);
			imagePanel.setBounds(rec);

			System.out.println("Fly to down left!!!!");
		}
		System.out.println("error");
	}

}
