package course02.prj12homework;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public abstract class ImagePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	FlyBehaviorHome flyBehaviorHome;

	JLabel imgLabel;
	Image image;
	ImageIcon imageIcon;
	int count = 0;
	private String fileName;

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public ImagePanel() {
		setOpaque(false);

		BufferedImage bufferedImage = new BufferedImage(256, 256, BufferedImage.TYPE_INT_RGB);
		ImageIcon iconImage;
		iconImage = new ImageIcon(bufferedImage);
		image = Toolkit.getDefaultToolkit().createImage("img\\" + fileName);
		imageIcon = new ImageIcon(image);
		setLayout(new BorderLayout(0, 0));
		imgLabel = new JLabel(iconImage);
		imageIcon.setImageObserver(imgLabel);
		imgLabel.setIcon(imageIcon);
		setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		// setBounds(0, 0, 100, 100);
		add(imgLabel);

	}

	public void perfomeFly(ImagePanel panel) {
		flyBehaviorHome.fly(panel);
	}

	public void setFlyBehavior(FlyBehaviorHome fb) {
		flyBehaviorHome = fb;
	}

	public void setImage(String fileName) {
		this.fileName = fileName;
		image = Toolkit.getDefaultToolkit().createImage("img\\" + fileName);
		imageIcon = new ImageIcon(image);
		imageIcon.setImageObserver(imgLabel);
		imgLabel.setIcon(imageIcon);
		imgLabel.setSize(imageIcon.getIconWidth(), imageIcon.getIconHeight());

	}

}
