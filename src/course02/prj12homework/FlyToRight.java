package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToRight implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToRight(ImagePanel imagePanel) {
		super();
		ImagePanel = imagePanel;
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		// int x = 0;
		// int y = 0;

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x < 450 - imagePanel.getWidth()) {
			rec.x = rec.x + 5;
		// rec.y = rec.y + 1;

		imagePanel.setBounds(rec);

		System.out.println("Fly to right!!!!");
		}
	}

}
