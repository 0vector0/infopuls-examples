package course02.prj12homework;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GifAnimation {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("test");
				frame.setSize(800, 400);

				JLabel jLabel = new JLabel("test");
				Image image = Toolkit.getDefaultToolkit()
						.createImage("img\\mario_duckHuntDuck.gif");
				ImageIcon imageIcon = new ImageIcon(image);
				imageIcon.setImageObserver(jLabel);
				jLabel.setIcon(imageIcon);

				frame.add(jLabel);

				frame.setVisible(true);
			}
		});
	}
}
