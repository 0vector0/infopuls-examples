package course02.prj12homework;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DuckHunt {

	private JFrame frame;
	DuckPanel duckPanel;
	GamePanel gamePanel;

	Timer timer;
	private JButton stopButton;
	int result;
	JLabel resultLabel;
	private JLabel labelDog;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DuckHunt window = new DuckHunt();
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
	public DuckHunt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		timer = new Timer(400, new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.out.println("timer");
			}
		});
		frame.getContentPane().setLayout(null);

		labelDog = new JLabel("New label");
		labelDog.setIcon(new ImageIcon("img\\dog.png"));
		labelDog.setBounds(150, 300, 300, 300);
		frame.getContentPane().add(labelDog);
		labelDog.setVisible(false);

		JPanel buttonpanel = new JPanel();
		buttonpanel.setBounds(700, 0, 100, 562);
		frame.getContentPane().add(buttonpanel);
		buttonpanel.setLayout(new GridLayout(0, 1, 0, 0));

		resultLabel = new JLabel("Результат 0");
		buttonpanel.add(resultLabel);

		JButton startButton = new JButton("start");
		buttonpanel.add(startButton);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				labelDog.setVisible(false);
				duckPanel.setVisible(true);
				timer.stop();
				timer = new Timer(50, new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						
						duckPanel.flyDuck(duckPanel);
					}
				});
				timer.start();

			}
		});

		stopButton = new JButton("stop");
		buttonpanel.add(stopButton);

		duckPanel = new DuckPanel();
		frame.getContentPane().add(duckPanel);
		duckPanel.setBounds(100, 100, 100, 100);
		//duckPanel.setBounds(400, 400, 100, 100);
		duckPanel.setVisible(false);
		gamePanel = new GamePanel();
		frame.getContentPane().add(gamePanel);

		duckPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				result++;
				resultLabel.setText("Результат " + Integer.toString(result));
				labelDog.setVisible(true);
				duckPanel.setVisible(false);
				timer.stop();

			}
		});
		stopButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
			}
		});
		frame.repaint();
	}
}
