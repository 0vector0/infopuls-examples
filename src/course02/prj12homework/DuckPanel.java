package course02.prj12homework;

import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DuckPanel extends JPanel {

	private String imageDuck;
	private BufferedImage bufferedImage;
	private ImageIcon iconImage;
	// BufferedImage in;

	/**
	 * Create the panel.
	 * 
	 * @throws IOException
	 */
	public DuckPanel() {

		imageDuck = "D:\\java\\workspace\\infopuls-examples\\img\\right.png";
		File img = new File(imageDuck);

		try {
			bufferedImage = ImageIO.read(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// bufferedImage = new BufferedImage(in.getWidth(), in.getHeight(),
		// BufferedImage.TYPE_INT_ARGB);

		// Graphics2D g = bufferedImage.createGraphics();
		// g.drawImage(in, 0, 0, null);
		// g.dispose();


		setLayout(new BorderLayout(0, 0));
		iconImage = new ImageIcon(bufferedImage);
		JLabel picLabel = new JLabel(iconImage);
		add(picLabel);

		setBounds(0, 0, 180, 180);

		// System.out.println(picLabel.getPreferredSize());


	}



}
