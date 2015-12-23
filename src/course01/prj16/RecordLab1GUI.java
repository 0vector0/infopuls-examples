package course01.prj16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class RecordLab1GUI {

	private JFrame frame;
	private JTextField subjectTextField;
	private JTextField tutorTextField;
	private JTextField numberLabsTextField;
	private JTextField doneLabsTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecordLab1GUI window = new RecordLab1GUI();
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
	public RecordLab1GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Предмет:");
		label.setBounds(49, 39, 71, 14);
		panel.add(label);
		
		subjectTextField = new JTextField();
		subjectTextField.setBounds(271, 39, 86, 20);
		panel.add(subjectTextField);
		subjectTextField.setColumns(10);
		
		JLabel label_1 = new JLabel("Предподаватель");
		label_1.setBounds(49, 67, 96, 14);
		panel.add(label_1);
		
		tutorTextField = new JTextField();
		tutorTextField.setColumns(10);
		tutorTextField.setBounds(271, 67, 86, 20);
		panel.add(tutorTextField);
		
		JLabel label_2 = new JLabel("Количество лаб.раб.:");
		label_2.setBounds(49, 95, 159, 14);
		panel.add(label_2);
		
		numberLabsTextField = new JTextField();
		numberLabsTextField.setColumns(10);
		numberLabsTextField.setBounds(271, 95, 86, 20);
		panel.add(numberLabsTextField);
		
		JLabel label_3 = new JLabel("Количество сданных:");
		label_3.setBounds(49, 123, 146, 14);
		panel.add(label_3);
		
		doneLabsTextField = new JTextField();
		doneLabsTextField.setColumns(10);
		doneLabsTextField.setBounds(271, 123, 86, 20);
		panel.add(doneLabsTextField);
		
		JButton saveChangesButton = new JButton("Принять изменения");
		saveChangesButton.setBounds(31, 164, 131, 23);
		panel.add(saveChangesButton);
		
		JButton cancelButton = new JButton("Отмена");
		cancelButton.setBounds(172, 164, 89, 23);
		panel.add(cancelButton);
		
		JButton button = new JButton("Редактировать");
		button.setBounds(268, 164, 125, 23);
		panel.add(button);
		
		JButton button_1 = new JButton("Удалить");
		button_1.setBounds(271, 196, 89, 23);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Создать");
		button_2.setBounds(271, 228, 89, 23);
		panel.add(button_2);
	}

}
