package course02.prj15pizza;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;

public class ggdfgd {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ggdfgd window = new ggdfgd();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ggdfgd() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JToggleButton toggleButton = new JToggleButton("New toggle button");
		toggleButton.setBounds(54, 86, 121, 23);
		frame.getContentPane().add(toggleButton);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(45, 145, 146, 14);
		frame.getContentPane().add(progressBar);
	}
}
