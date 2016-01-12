package course01.calculatorTest;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @version 1.33 2007-06-12
 * @author Cay Horstmann
 */
public class ActionTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				ActionFrame frame = new ActionFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}

/**
 * Фрейм с панелью, демонстрирующей действия изменения цвета.
 */
class ActionFrame extends JFrame {

	private JPanel buttonPanel;
	private JTextPane textPane;
	public static final int DEFAULT_WIDTH = 300;
	public static final int DEFAULT_HEIGHT = 200;

	public ActionFrame() {
		setTitle("ActionTest");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
		buttonPanel = new JPanel();
		// Определение действий.
		// Action button1Action = new ButtonAction("1");

		Action button1Action = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText("1");
			}
		};
		/*Action button2Action = new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textPane.setText("2");
			}
		};*/

		// Добавление кнопок для действий.
		buttonPanel.add(new JButton("1"));
		buttonPanel.add(new JButton("2"));

		textPane = new JTextPane();
		textPane.setText("test");
		buttonPanel.add(textPane);
		// Добавление панели к фрейму.
		add(buttonPanel);
		// Связывание клавиш Y, B и R с именами.
		InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		String str = "1";
		imap.put(KeyStroke.getKeyStroke("1"), "panel1");
		//imap.get()
		imap.put(KeyStroke.getKeyStroke("2"), "panel1");
		// Связывание имен с действиями.
		ActionMap amap = buttonPanel.getActionMap();
		amap.put("panel1", button1Action);
		//amap.put("panel2", button2Action);
	}

}