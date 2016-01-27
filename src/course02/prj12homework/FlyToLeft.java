package course02.prj12homework;

import java.awt.Rectangle;

public class FlyToLeft implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToLeft(ImagePanel imagePanel) {
		super();
		ImagePanel = imagePanel;
		// imagePanel.setFileName("left1.png");
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x > 0) {
			rec.x = rec.x - 5;
			changeImage(imagePanel);
			imagePanel.setBounds(rec);
			System.out.println("Fly to left!!!!");
		}

	}

	public void changeImage(ImagePanel imagePanel) {

		if (imagePanel.getFileName().equals("right1.png") || imagePanel.getFileName().equals("right2.png")
				|| imagePanel.getFileName().equals("right3.png")) {
			imagePanel.setImage("left1.png");
		} else {
			if (imagePanel.getFileName().equals("left1.png")) {
				imagePanel.setImage("left2.png");
			} else {
				if (imagePanel.getFileName().equals("left2.png")) {
					imagePanel.setImage("left3.png");
				} else {
					if (imagePanel.getFileName().equals("left3.png")) {
						imagePanel.setImage("left1.png");
					}
				}
			}
		}
	}
}
