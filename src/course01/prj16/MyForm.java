package course01.prj16;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyForm {

	private JFrame frmTest;
	JButton btnNewButton_2;
	private JTextField textFieldX;
	private JTextField textFieldY;
	private JTextField textFieldOper;
	private JTextField textFieldRes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyForm window = new MyForm();
					window.frmTest.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MyForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTest = new JFrame();
		frmTest.setTitle("MyForm");
		frmTest.setBounds(100, 100, 450, 300);
		frmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frmTest.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		btnNewButton_2 = new JButton("Calculate");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = Integer.parseInt(textFieldX.getText());
				int y = Integer.parseInt(textFieldY.getText());
				char znak = textFieldOper.getText().charAt(0);
				double result = 0;
				switch (znak) {
				case '+': 
					result = x + y;
					break;
				case '-':
					result = x - y;
					break;
				case '*':
					result = x * y;
					break;
				case '/':
					result = x / y;
					break;
				}
				textFieldRes.setText(Double.toString(result));
			}
		});
		btnNewButton_2.setBounds(111, 170, 89, 20);
		/*btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_2.setText("Click");

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				btnNewButton_2.setText("Enter");
				int x = btnNewButton_2.getX();
				int y = btnNewButton_2.getY();
				btnNewButton_2.setBounds(10 + x, 10 + y, 89, 83);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_2.setText("exit");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				btnNewButton_2.setText("press");
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				btnNewButton_2.setText("Released");
			}
		});
*/
		panel.add(btnNewButton_2);

		textFieldX = new JTextField();
		textFieldX.setBounds(111, 45, 86, 20);
		panel.add(textFieldX);
		textFieldX.setColumns(10);

		textFieldY = new JTextField();
		textFieldY.setBounds(111, 108, 86, 20);
		panel.add(textFieldY);
		textFieldY.setColumns(10);

		JButton button = new JButton("New button");
		button.setBounds(237, 108, 89, 20);
		panel.add(button);

		textFieldOper = new JTextField();
		textFieldOper.setBounds(111, 76, 86, 20);
		panel.add(textFieldOper);
		textFieldOper.setColumns(10);

		JLabel var1 = new JLabel("var1");
		var1.setBounds(55, 49, 46, 14);
		panel.add(var1);

		JLabel lblVar = new JLabel("var2");
		lblVar.setBounds(55, 111, 46, 14);
		panel.add(lblVar);

		JLabel Operation = new JLabel("Operation");
		Operation.setBounds(32, 79, 69, 14);
		panel.add(Operation);

		textFieldRes = new JTextField();
		textFieldRes.setEditable(false);
		textFieldRes.setColumns(10);
		textFieldRes.setBounds(111, 139, 86, 20);
		panel.add(textFieldRes);

		JLabel label_1 = new JLabel("=");
		label_1.setBounds(55, 142, 46, 14);
		panel.add(label_1);
		
		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldX.setText(textFieldX.getText() + "1");
			}
		});
		button_1.setBounds(237, 44, 89, 23);
		panel.add(button_1);
	}
}
