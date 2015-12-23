package course01.prj10.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import course01.prj10.Student;
import javax.swing.JTextArea;

public class StudentForm {

	private JFrame frame;
	private JTextField textFieldFio;
	private JTextField textFieldGroup;
	int count= 0;
	Student[] massStud;
	JTextArea textArea ;
	int curStud;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm window = new StudentForm();
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
	public StudentForm() {
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

		textFieldFio = new JTextField();
		textFieldFio.setBounds(32, 42, 86, 20);
		panel.add(textFieldFio);
		textFieldFio.setColumns(10);

		textFieldGroup = new JTextField();
		textFieldGroup.setBounds(32, 70, 86, 20);
		panel.add(textFieldGroup);
		textFieldGroup.setColumns(10);

		JButton btnAddButton = new JButton("Add");
		btnAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				massStud = new Student [5];
				String fio = textFieldFio.getText();
				int group = Integer.parseInt(textFieldGroup.getText());
				massStud[count] = new Student(fio, group);
				textArea.setText(textArea.getText() + "\n" + massStud[count]);
				curStud = count;
				count++;
			}
		});
		btnAddButton.setBounds(154, 69, 89, 23);
		panel.add(btnAddButton);

		JButton buttonLeft = new JButton("<<");
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (curStud >= 0) {
					curStud--;
				textFieldFio.setText(massStud[curStud].getFio());
				textFieldGroup.setText(Integer.toString(massStud[curStud].getNumGroup()));
				}
				
			}
		});
		buttonLeft.setBounds(56, 101, 89, 23);
		panel.add(buttonLeft);

		JButton buttonRight = new JButton(">>");
		buttonRight.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if (curStud < count) {
					curStud++;
				textFieldFio.setText(massStud[curStud].getFio());
				textFieldGroup.setText(Integer.toString(massStud[curStud].getNumGroup()));
				
				}}
		});
		buttonRight.setBounds(154, 103, 89, 23);
		panel.add(buttonRight);
		
		textArea = new JTextArea();
		textArea.setBounds(20, 135, 334, 116);
		panel.add(textArea);
	}
}
