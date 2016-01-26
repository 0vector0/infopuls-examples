package course02.prj12homework;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class DuckPanel extends JPanel {
	public DuckPanel() {
	}

	private BufferedImage bufferedImage;
	private ImageIcon iconImage;
	int x;
	private String imageDuck = "D:\\java\\workspace\\infopuls-examples\\img\\mario_duckHuntDuck.gif";
	File img = new File(imageDuck);
	// int y;
	// BufferedImage in;

	/**
	 * Create the panel.
	 * 
	 * @throws IOException
	 */



		// bufferedImage = new BufferedImage(in.getWidth(), in.getHeight(),
		// BufferedImage.TYPE_INT_ARGB);

		// Graphics2D g = bufferedImage.createGraphics();
		// g.drawImage(in, 0, 0, null);
		// g.dispose();




		// System.out.println(picLabel.getPreferredSize());



	void fly(Graphics g) {
		try {
			bufferedImage = ImageIO.read(img);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setLayout(new BorderLayout(0, 0));
		iconImage = new ImageIcon(bufferedImage);
		JLabel picLabel = new JLabel(iconImage);
		add(picLabel);

		// setBounds(0, 0, 180, 180);
		setBounds(x, 0, 180, 180);
		}


	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		fly(g);
	}
}
