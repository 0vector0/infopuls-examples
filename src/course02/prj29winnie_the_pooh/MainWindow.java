package course02.prj29winnie_the_pooh;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainWindow extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
					frame.startWinnie();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel contentPane;
	private volatile JPanel panel = new JPanel();
	private volatile JLabel infoLabel;

	private Winnie winnie;

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 580);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		panel.setBackground(Color.GREEN);
		panel.setBounds(100, 100, 500, 500);
		contentPane.add(panel, BorderLayout.CENTER);

		JButton startButton = new JButton("Наказать");
		startButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Hive hive = new Hive(panel, infoLabel, winnie);
				new Thread(hive).start();
				infoLabel.setText("Ищем");
			}
		});
		contentPane.add(startButton, BorderLayout.NORTH);

		infoLabel = new JLabel();
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(infoLabel, BorderLayout.SOUTH);

	}

	public void startWinnie() {
		winnie = new Winnie(panel);
		new Thread(winnie).start();
	}
}
