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

		// int x = 0;
		// int y = 0;
		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());
		// rec.x = rec.x + 1;
		if (rec.y < 300 - imagePanel.getHeight() - 40)
			rec.y = rec.y + 5;

		imagePanel.setBounds(rec);

		System.out.println("Fly to down!!!!");
	}

}

