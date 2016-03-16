package course02.prj27Slider;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;

public class MainWindowSlider extends JFrame {

	private JPanel contentPane;
	JSlider slider;
	int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowSlider frame = new MainWindowSlider();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindowSlider() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		SliderThread sliderThreadplus = new SliderThread(slider, 1);
		SliderThread sliderThreadminus = new SliderThread(slider, -1);

		slider = new JSlider();
		slider.setBounds(103, 58, 200, 23);
		contentPane.add(slider);

		JButton btnNewButton = new JButton("+");
		btnNewButton.setBounds(32, 125, 89, 23);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setBounds(32, 159, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("+");
		btnNewButton_2.setBounds(277, 125, 89, 23);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.setBounds(277, 159, 89, 23);
		contentPane.add(btnNewButton_3);

		JButton btnStart = new JButton("start");
		btnStart.setBounds(156, 24, 89, 23);
		contentPane.add(btnStart);
	}
}
