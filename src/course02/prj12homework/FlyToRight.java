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

		ImagePanel = imagePanel;
		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x < 700 - imagePanel.getWidth()) {
			rec.x = rec.x + 5;
			changeImage(imagePanel);
			imagePanel.setBounds(rec);
		}
	}

	public void changeImage(ImagePanel imagePanel) {

		if (!imagePanel.getFileName().equals("right1.png") && !imagePanel.getFileName().equals("right2.png")
				&& !imagePanel.getFileName().equals("right3.png")) {
			imagePanel.setImage("right1.png");
			return;
		}
		if (imagePanel.getFileName().equals("left1.png") || imagePanel.getFileName().equals("left2.png")
				|| imagePanel.getFileName().equals("left3.png")) {
			imagePanel.setImage("right1.png");
			return;
		}

		if (imagePanel.getFileName().equals("right1.png")) {
			imagePanel.setImage("right2.png");
			return;
		}
		if (imagePanel.getFileName().equals("right2.png")) {
			imagePanel.setImage("right3.png");
			return;
		}
		if (imagePanel.getFileName().equals("right3.png")) {
			imagePanel.setImage("right1.png");
			return;
		}
	}
}
