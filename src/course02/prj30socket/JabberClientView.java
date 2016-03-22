package course02.prj30socket;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

public class JabberClientView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField hostField;
	private JTextField portField;
	private JTextPane textArea;
	private BufferedReader in = null;
	private boolean connected;

	private Socket socket;
	private JTextField nameTextField;
	// final PrintWriter out = new PrintWriter(new BufferedWriter(new
	// OutputStreamWriter(socket.getOutputStream())), true);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JabberClientView frame = new JabberClientView();
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
	public JabberClientView() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				try {
					disConnect();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				System.exit(0);
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new BorderLayout(0, 0));

		JButton sendButton = new JButton("Отправить");
		sendButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					sendToPort();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel.add(sendButton, BorderLayout.EAST);

		textField = new JTextField();
		panel.add(textField, BorderLayout.CENTER);
		textField.setColumns(10);

		nameTextField = new JTextField();
		panel.add(nameTextField, BorderLayout.WEST);
		nameTextField.setColumns(10);

		textArea = new JTextPane();
		textArea.setText("");
		contentPane.add(new JScrollPane(textArea), BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);

		JLabel hostLabel = new JLabel("IP");
		panel_1.add(hostLabel);

		hostField = new JTextField();
		hostField.setText("localhost");
		panel_1.add(hostField);
		hostField.setColumns(8);

		JLabel portLabel_1 = new JLabel("PORT");
		panel_1.add(portLabel_1);

		portField = new JTextField();
		portField.setText("8080");
		panel_1.add(portField);
		portField.setColumns(4);

		JButton connectButton = new JButton("Соединить");
		connectButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					connect();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(connectButton);

		JButton disConnectButton = new JButton("Отключить");
		disConnectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					disConnect();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		panel_1.add(disConnectButton);
	}

	public void connect() throws IOException {
		String host = hostField.getText();
		int port = Integer.valueOf(portField.getText());

		try {
			socket = new Socket(host, port);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			connected = true;
			upDate();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		System.out.println("socket = " + socket);
	}

	public void disConnect() throws IOException {
		// System.out.println("disconnect");
		connected = false;
		try {
			socket.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void sendToPort() throws IOException {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),
					true);

			if (!textField.getText().equals("")) {
				out.println(nameTextField.getText() + " - " + textField.getText());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Отправленно");
			textField.setText("");
		}
	}

	public void upDate() throws IOException {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (!connected) {
					String str = null;
					try {
						str = in.readLine();
						if (str != null) {
							textArea.setText(textArea.getText() + str + "\n");
						}
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}
