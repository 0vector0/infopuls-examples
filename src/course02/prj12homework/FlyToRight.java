package course02.prj12homework;

import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

public class FlyToRight implements FlyBehaviorHome {

	ImagePanel ImagePanel;

	public FlyToRight(ImagePanel imagePanel) {
		super();
		ImagePanel = imagePanel;
		// imagePanel.setFileName("right1.png");
	}

	@Override
	public void fly(ImagePanel imagePanel) {

		ImagePanel = imagePanel;

		Rectangle rec = new Rectangle(imagePanel.getBounds());

		if (rec.x < 700 - imagePanel.getWidth()) {
			rec.x = rec.x + 5;
			changeImage(imagePanel);
			imagePanel.setBounds(rec);
			System.out.println("Fly to right!!!!");
		}

	}

	public void changeImage(ImagePanel imagePanel) {

		if (imagePanel.getFileName().equals("left1.png") || imagePanel.getFileName().equals("left2.png")
				|| imagePanel.getFileName().equals("left3.png")) {
			imagePanel.setImage("right1.png");
		} else {

			if (imagePanel.getFileName().equals("right1.png")) {
				imagePanel.setImage("right2.png");
			} else {
				if (imagePanel.getFileName().equals("right2.png")) {
					imagePanel.setImage("right3.png");
				} else {
					if (imagePanel.getFileName().equals("right3.png")) {
						imagePanel.setImage("right1.png");
					}
				}
			}
		}
	}

}
