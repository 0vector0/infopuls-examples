package course02.prj12homework;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class DuckHunt {

	private JFrame frame;
	DuckPanel duckPanel;
	GamePanel gamePanel;

	// int x;
	// int y;
	Timer timer;
	private JButton stopButton;
	private JButton leftButton;
	private JButton rightButton;
	int result;
	JLabel resultLabel;

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
		
		timer = new Timer(50, new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.out.println("timer");
			}
		});
		frame.getContentPane().setLayout(null);

		JPanel buttonpanel = new JPanel();
		buttonpanel.setBounds(500, 0, 100, 562);
		frame.getContentPane().add(buttonpanel);
		buttonpanel.setLayout(new GridLayout(0, 1, 0, 0));

		resultLabel = new JLabel("Результат 0");
		buttonpanel.add(resultLabel);

		JButton startButton = new JButton("start");
		buttonpanel.add(startButton);
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				timer.stop();
				timer = new Timer(5, new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						duckPanel.flyDuck(duckPanel);
						// duckPanel.setFlyBehavior(new FlyToLeft(duckPanel));
						// duckPanel.perfomeFly(duckPanel);
					}
				});
				timer.start();

			}
		});

		rightButton = new JButton("Right");
		buttonpanel.add(rightButton);

		leftButton = new JButton("Left");
		buttonpanel.add(leftButton);

		stopButton = new JButton("stop");
		buttonpanel.add(stopButton);
		duckPanel = new DuckPanel();
		frame.getContentPane().add(duckPanel);

		gamePanel = new GamePanel();
		// gamePanel.setBounds(0, 0, 10, 10);
		frame.getContentPane().add(gamePanel);

		// duckPanel.setBounds(0, 0, 0, 0);
		duckPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				result++;
				resultLabel.setText("Результат " + Integer.toString(result));

			}
		});
		stopButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
			}
		});
		leftButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
				timer = new Timer(10, new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						duckPanel.setFlyBehavior(new FlyToDown(duckPanel));
						duckPanel.perfomeFly(duckPanel);
					}
				});
				timer.start();
			}

		});
		rightButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				timer.stop();
				timer = new Timer(10, new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
						duckPanel.setFlyBehavior(new FlyToRight(duckPanel));
						duckPanel.perfomeFly(duckPanel);
					}
				});
				timer.start();
			}

		});
		frame.repaint();
	}
}
