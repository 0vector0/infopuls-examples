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
	// int x;
	// int y;
	private String filePath = "D:\\java\\workspace\\infopuls-examples\\img\\right1.png";


	public ImagePanel() {

		BufferedImage bufferedImage = new BufferedImage(256, 256, BufferedImage.TYPE_INT_RGB);
		ImageIcon iconImage;
		int x;
		String imageDuck = "D:\\java\\workspace\\infopuls-examples\\img\\sunny_256.png";
		File img = new File(imageDuck);
		try {
			bufferedImage = ImageIO.read(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		iconImage = new ImageIcon(bufferedImage);
		// JLabel picLabel = new JLabel(iconImage);
		// add(picLabel);

		// this.x = x;
		// this.y = y;
		image = Toolkit.getDefaultToolkit().createImage(filePath);
		imageIcon = new ImageIcon(image);
		setLayout(new BorderLayout(0, 0));
		imgLabel = new JLabel(iconImage);
		imageIcon.setImageObserver(imgLabel);
		imgLabel.setIcon(imageIcon);
		setBounds(0, 0, imageIcon.getIconWidth(), imageIcon.getIconHeight());
		setBounds(0, 0, 100, 100);
		add(imgLabel);

	}

	public void perfomeFly(ImagePanel panel) {

		flyBehaviorHome.fly(panel);
	}

	public void setFlyBehavior(FlyBehaviorHome fb) {
		flyBehaviorHome = fb;
	}

}
