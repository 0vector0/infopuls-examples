package course02.prj12homework;

import java.awt.BorderLayout;
import java.awt.EventQueue;

public class DuckHunt {

	// private JFrame frame;
	private static MainWindowFrame mainWindowFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindowFrame = new MainWindowFrame();
					mainWindowFrame.getContentPane().setLayout(new BorderLayout(0, 0));
					// DuckHunt window = new DuckHunt();
					mainWindowFrame.setVisible(true);
					for (int i = 0; i < 100; i++) {
						mainWindowFrame.duckPanel.x = i;
						// mainWindowFrame.duckPanel.y = i;

						Thread.sleep(100);
						mainWindowFrame.repaint();
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	/*
	 * public DuckHunt() { initialize(); }
	 * 
	 *//**
		 * Initialize the contents of the frame.
		 *//*
		 * private void initialize() { frame = new JFrame();
		 * frame.setBounds(100, 100, 450, 300);
		 * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); }
		 */

}
