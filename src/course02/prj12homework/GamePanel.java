package course02.prj12homework;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel {

	/**
	 * Create the panel.
	 */

	JLabel imgBackGroundLabel;
	Image imageBackGround;
	ImageIcon imageIconBackGround;
	private String filePath = "img\\background.png";

	public GamePanel() {
		imageBackGround = Toolkit.getDefaultToolkit().createImage(filePath);
		imageIconBackGround = new ImageIcon(imageBackGround);
		setLayout(new BorderLayout(0, 0));
		imgBackGroundLabel = new JLabel();
		imageIconBackGround.setImageObserver(imgBackGroundLabel);
		imgBackGroundLabel.setIcon(imageIconBackGround);
		setBounds(0, 0, imageIconBackGround.getIconWidth(), imageIconBackGround.getIconHeight());
		add(imgBackGroundLabel);

	}

}
