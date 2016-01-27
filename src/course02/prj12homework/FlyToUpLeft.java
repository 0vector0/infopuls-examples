

package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToUpLeft extends FlyToLeft implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToUpLeft(ImagePanel imagePanel) {
		super(imagePanel);
		ImagePanel = imagePanel;
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x > 0  && rec.y > 0) {
			rec.x = rec.x + 5;
			rec.y = rec.y - 5;
			changeImage(imagePanel);
			imagePanel.setBounds(rec);

		//	System.out.println("Fly to up left!!!!");
		}
		//System.out.println("error");
	}

}
