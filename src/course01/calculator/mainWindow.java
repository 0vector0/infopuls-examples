package course01.calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.BoxLayout;
import javax.swing.InputMap;

import java.awt.Dimension;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class mainWindow {

	// final String strNumber1 = "1";
	String ACTION_KEY = "The Action";
	private JFrame frame;
	double inputNumber = 0;
	String tempInputNumberStr;
	String operationStr;
	boolean bool = false;

	JTextPane textPaneResult = new JTextPane();
	JTextPane textPaneMainResult = new JTextPane();

	JButton button1 = new JButton("1");
	JButton button2 = new JButton("2");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow window = new mainWindow();
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
	public mainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Калькулятор");
		frame.setResizable(false);
		frame.setSize(220, 310);
		frame.setLocationByPlatform(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String ACTION_KEY = "";

		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Вид");
		menuBar.add(mnNewMenu);

		JMenu menu = new JMenu("Правка");
		menuBar.add(menu);

		JMenuItem menuItem_2 = new JMenuItem("Копировать");
		menu.add(menuItem_2);

		JMenuItem menuItem_3 = new JMenuItem("Вставить");
		menu.add(menuItem_3);

		JMenu menu_1 = new JMenu("Справка");
		menuBar.add(menu_1);

		JMenuItem menuItem = new JMenuItem("Посмотреть справку");
		menu_1.add(menuItem);

		JSeparator separator = new JSeparator();
		menu_1.add(separator);

		JMenuItem menuItem_1 = new JMenuItem("О программе");
		menu_1.add(menuItem_1);

		JPanel panel = new JPanel();
		panel.setBorder(new EmptyBorder(10, 10, 10, 10));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JPanel panelResultGeneral = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				Paint paint = new GradientPaint(0, 0, new Color(229, 239, 251), 0, getHeight(), Color.white, true);
				((Graphics2D) g).setPaint(paint);
				g.fillRect(0, 0, getWidth(), getHeight());
				super.paintComponent(g);
			}
		};
		panelResultGeneral.setOpaque(false);
		panelResultGeneral.setPreferredSize(new Dimension(0, 55));
		panelResultGeneral.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel.add(panelResultGeneral, BorderLayout.NORTH);
		panelResultGeneral.setLayout(new BorderLayout(0, 0));

		JPanel panelResultRight = new JPanel();
		panelResultRight.setOpaque(false);
		panelResultGeneral.add(panelResultRight, BorderLayout.NORTH);
		panelResultRight.setLayout(new BorderLayout(0, 0));
		panelResultRight.add(textPaneResult, BorderLayout.EAST);

		textPaneResult.setText("");
		textPaneResult.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textPaneResult.setOpaque(false);
		textPaneResult.setEditable(false);

		JPanel panelMainResultRight = new JPanel();
		panelMainResultRight.setOpaque(false);
		panelResultGeneral.add(panelMainResultRight, BorderLayout.SOUTH);
		panelMainResultRight.setLayout(new BorderLayout(0, 0));
		panelMainResultRight.add(textPaneMainResult, BorderLayout.EAST);

		textPaneMainResult.setOpaque(false);
		textPaneMainResult.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		textPaneMainResult.setEditable(false);
		textPaneMainResult.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textPaneMainResult.setText("0");

		JPanel panelButton = new JPanel();
		panelButton.setBorder(new EmptyBorder(5, 0, 0, 0));
		panel.add(panelButton, BorderLayout.CENTER);
		GridBagLayout gbl_panelButton = new GridBagLayout();
		gbl_panelButton.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelButton.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelButton.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelButton.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE };
		panelButton.setLayout(gbl_panelButton);

		// top buttons
		JButton backSpaceButton = new JButton("\u2190");
		backSpaceButton.setMargin(new Insets(0, 0, 0, 0));
		backSpaceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_backSpaceButton = new GridBagConstraints();
		gbc_backSpaceButton.fill = GridBagConstraints.BOTH;
		gbc_backSpaceButton.insets = new Insets(0, 0, 5, 5);
		gbc_backSpaceButton.gridx = 0;
		gbc_backSpaceButton.gridy = 0;
		panelButton.add(backSpaceButton, gbc_backSpaceButton);

		JButton CE_Button = new JButton("CE");
		CE_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPaneMainResult.setText("0");
				textPaneResult.setText("");
				textPaneMainResult.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
		});
		CE_Button.setMargin(new Insets(0, 0, 0, 0));
		CE_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_CE_Button = new GridBagConstraints();
		gbc_CE_Button.fill = GridBagConstraints.BOTH;
		gbc_CE_Button.insets = new Insets(0, 0, 5, 5);
		gbc_CE_Button.gridx = 1;
		gbc_CE_Button.gridy = 0;
		panelButton.add(CE_Button, gbc_CE_Button);

		JButton C_Button = new JButton("C");
		C_Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textPaneMainResult.setText("0");
				textPaneResult.setText("");
				textPaneMainResult.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
		});
		C_Button.setMargin(new Insets(0, 0, 0, 0));
		C_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		GridBagConstraints gbc_C_Button = new GridBagConstraints();
		gbc_C_Button.fill = GridBagConstraints.BOTH;
		gbc_C_Button.insets = new Insets(0, 0, 5, 5);
		gbc_C_Button.gridx = 2;
		gbc_C_Button.gridy = 0;
		panelButton.add(C_Button, gbc_C_Button);

		// number buttons
		JButton button0 = new JButton("0");
		button0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (!textPaneMainResult.getText().equals("0")) {
					buttonNumberClick("0");
				}
			}
		});
		button0.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button0 = new GridBagConstraints();
		gbc_button0.fill = GridBagConstraints.BOTH;
		gbc_button0.gridwidth = 2;
		gbc_button0.insets = new Insets(0, 0, 0, 5);
		gbc_button0.gridx = 0;
		gbc_button0.gridy = 4;
		panelButton.add(button0, gbc_button0);

		button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("1");
			}
		});

		button1.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button1 = new GridBagConstraints();
		gbc_button1.fill = GridBagConstraints.BOTH;
		gbc_button1.insets = new Insets(0, 0, 5, 5);
		gbc_button1.gridx = 0;
		gbc_button1.gridy = 3;
		panelButton.add(button1, gbc_button1);

		button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("2");
			}
		});
		button2.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button2 = new GridBagConstraints();
		gbc_button2.fill = GridBagConstraints.BOTH;
		gbc_button2.insets = new Insets(0, 0, 5, 5);
		gbc_button2.gridx = 1;
		gbc_button2.gridy = 3;
		panelButton.add(button2, gbc_button2);

		JButton button3 = new JButton("3");
		button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("3");
			}
		});
		button3.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button3 = new GridBagConstraints();
		gbc_button3.fill = GridBagConstraints.BOTH;
		gbc_button3.insets = new Insets(0, 0, 5, 5);
		gbc_button3.gridx = 2;
		gbc_button3.gridy = 3;
		panelButton.add(button3, gbc_button3);

		JButton button4 = new JButton("4");
		button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("4");
			}
		});
		button4.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button4 = new GridBagConstraints();
		gbc_button4.fill = GridBagConstraints.BOTH;
		gbc_button4.insets = new Insets(0, 0, 5, 5);
		gbc_button4.gridx = 0;
		gbc_button4.gridy = 2;
		panelButton.add(button4, gbc_button4);

		JButton button5 = new JButton("5");
		button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("5");
			}
		});
		button5.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button5 = new GridBagConstraints();
		gbc_button5.fill = GridBagConstraints.BOTH;
		gbc_button5.insets = new Insets(0, 0, 5, 5);
		gbc_button5.gridx = 1;
		gbc_button5.gridy = 2;
		panelButton.add(button5, gbc_button5);

		JButton button6 = new JButton("6");
		button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("6");
			}
		});
		button6.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button6 = new GridBagConstraints();
		gbc_button6.fill = GridBagConstraints.BOTH;
		gbc_button6.insets = new Insets(0, 0, 5, 5);
		gbc_button6.gridx = 2;
		gbc_button6.gridy = 2;
		panelButton.add(button6, gbc_button6);

		JButton button7 = new JButton("7");
		button7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("7");
			}
		});
		button7.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button7 = new GridBagConstraints();
		gbc_button7.fill = GridBagConstraints.BOTH;
		gbc_button7.insets = new Insets(0, 0, 5, 5);
		gbc_button7.gridx = 0;
		gbc_button7.gridy = 1;
		panelButton.add(button7, gbc_button7);

		JButton button8 = new JButton("8");
		button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("8");
			}
		});
		button8.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button8 = new GridBagConstraints();
		gbc_button8.fill = GridBagConstraints.BOTH;
		gbc_button8.insets = new Insets(0, 0, 5, 5);
		gbc_button8.gridx = 1;
		gbc_button8.gridy = 1;
		panelButton.add(button8, gbc_button8);

		JButton button9 = new JButton("9");
		button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				buttonNumberClick("9");
			}
		});
		button9.setMargin(new Insets(0, 0, 0, 0));
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_button9 = new GridBagConstraints();
		gbc_button9.fill = GridBagConstraints.BOTH;
		gbc_button9.insets = new Insets(0, 0, 5, 5);
		gbc_button9.gridx = 2;
		gbc_button9.gridy = 1;
		panelButton.add(button9, gbc_button9);

		// main operation buttons
		JButton buttonPlus = new JButton("+");
		buttonPlus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setOPerationTextPaneResult("+");
			}
		});
		buttonPlus.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_buttonPlus = new GridBagConstraints();
		gbc_buttonPlus.fill = GridBagConstraints.BOTH;
		gbc_buttonPlus.insets = new Insets(0, 0, 0, 5);
		gbc_buttonPlus.gridx = 3;
		gbc_buttonPlus.gridy = 4;
		panelButton.add(buttonPlus, gbc_buttonPlus);

		JButton buttonMinus = new JButton("-");
		buttonMinus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setOPerationTextPaneResult("-");
			}
		});
		buttonMinus.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_buttonMinus = new GridBagConstraints();
		gbc_buttonMinus.fill = GridBagConstraints.BOTH;
		gbc_buttonMinus.insets = new Insets(0, 0, 5, 5);
		gbc_buttonMinus.gridx = 3;
		gbc_buttonMinus.gridy = 3;
		panelButton.add(buttonMinus, gbc_buttonMinus);

		JButton buttonMultiplication = new JButton("*");
		buttonMultiplication.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setOPerationTextPaneResult("*");
			}
		});
		buttonMultiplication.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_buttonMultiplication = new GridBagConstraints();
		gbc_buttonMultiplication.fill = GridBagConstraints.BOTH;
		gbc_buttonMultiplication.insets = new Insets(0, 0, 5, 5);
		gbc_buttonMultiplication.gridx = 3;
		gbc_buttonMultiplication.gridy = 2;
		panelButton.add(buttonMultiplication, gbc_buttonMultiplication);

		JButton buttonDivinity = new JButton("/");
		buttonDivinity.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setOPerationTextPaneResult("/");
			}
		});
		buttonDivinity.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_buttonDivinity = new GridBagConstraints();
		gbc_buttonDivinity.fill = GridBagConstraints.BOTH;
		gbc_buttonDivinity.insets = new Insets(0, 0, 5, 5);
		gbc_buttonDivinity.gridx = 3;
		gbc_buttonDivinity.gridy = 1;
		panelButton.add(buttonDivinity, gbc_buttonDivinity);

		// another operation buttons
		JButton buttonPercent = new JButton("\u0025");
		buttonPercent.setMargin(new Insets(0, 0, 0, 0));
		buttonPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_buttonPercent = new GridBagConstraints();
		gbc_buttonPercent.fill = GridBagConstraints.BOTH;
		gbc_buttonPercent.insets = new Insets(0, 0, 5, 0);
		gbc_buttonPercent.gridx = 4;
		gbc_buttonPercent.gridy = 1;
		panelButton.add(buttonPercent, gbc_buttonPercent);

		JButton plusMinusButton = new JButton("\u00B1");
		plusMinusButton.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_plusMinusButton = new GridBagConstraints();
		gbc_plusMinusButton.fill = GridBagConstraints.BOTH;
		gbc_plusMinusButton.insets = new Insets(0, 0, 5, 5);
		gbc_plusMinusButton.gridx = 3;
		gbc_plusMinusButton.gridy = 0;
		panelButton.add(plusMinusButton, gbc_plusMinusButton);

		JButton sqrtButton = new JButton("\u221A");
		sqrtButton.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_sqrtButton = new GridBagConstraints();
		gbc_sqrtButton.fill = GridBagConstraints.BOTH;
		gbc_sqrtButton.insets = new Insets(0, 0, 5, 0);
		gbc_sqrtButton.gridx = 4;
		gbc_sqrtButton.gridy = 0;
		panelButton.add(sqrtButton, gbc_sqrtButton);

		JButton button1DivinityX = new JButton("1/x");
		button1DivinityX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// textPaneMainResult.setText(setOutResultStr(textPaneMainResult.getText()));
			}
		});
		button1DivinityX.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_button1DivinityX = new GridBagConstraints();
		gbc_button1DivinityX.fill = GridBagConstraints.BOTH;
		gbc_button1DivinityX.insets = new Insets(0, 0, 5, 0);
		gbc_button1DivinityX.gridx = 4;
		gbc_button1DivinityX.gridy = 2;
		panelButton.add(button1DivinityX, gbc_button1DivinityX);

		JButton buttonComa = new JButton(",");
		buttonComa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strComa = textPaneMainResult.getText();
				if (!strComa.contains(",")) {
					textPaneMainResult.setText(textPaneMainResult.getText() + ",");
				}
			}
		});
		buttonComa.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_buttonComa = new GridBagConstraints();
		gbc_buttonComa.fill = GridBagConstraints.BOTH;
		gbc_buttonComa.insets = new Insets(0, 0, 0, 5);
		gbc_buttonComa.gridx = 2;
		gbc_buttonComa.gridy = 4;
		panelButton.add(buttonComa, gbc_buttonComa);

		// buttonEquall
		JButton buttonEquall = new JButton("=");
		buttonEquall.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				double var1 = inputNumber;
				double var2 = Double.parseDouble(getOutResultStr(textPaneMainResult.getText()));
				char operationChar = operationStr.charAt(0);
				textPaneResult.setText("");
				switch (operationChar) {
				case '+': {
					textPaneMainResult.setText(setOutResultStr(String.valueOf(var1 + var2)));
					bool = true;
					break;
				}
				case '-': {
					textPaneMainResult.setText(setOutResultStr(String.valueOf(var1 - var2)));
					bool = true;
					break;
				}
				case '*':
					textPaneMainResult.setText(setOutResultStr(String.valueOf(var1 * var2)));
					bool = true;
					break;
				case '/':
					if (!textPaneMainResult.getText().equals("0")) {
						textPaneMainResult.setText(setOutResultStr(String.valueOf(var1 / var2)));
						bool = true;
						break;
					} else {
						textPaneMainResult.setFont(new Font("Tahoma", Font.PLAIN, 15));
						textPaneMainResult.setText("Деление на 0 невозможно");
						bool = true;
						break;
					}
				default:
					break;
				}

			}
		});
		buttonEquall.setMargin(new Insets(0, 0, 0, 0));
		GridBagConstraints gbc_buttonEquall = new GridBagConstraints();
		gbc_buttonEquall.fill = GridBagConstraints.BOTH;
		gbc_buttonEquall.gridheight = 2;
		gbc_buttonEquall.gridx = 4;
		gbc_buttonEquall.gridy = 3;
		panelButton.add(buttonEquall, gbc_buttonEquall);

		// keyboard actionListenerButtonNumber
		Action actionListenerButtonNumber = new AbstractAction() {
			public void actionPerformed(ActionEvent actionEvent) {
				JButton source = (JButton) actionEvent.getSource();
				buttonNumberClick(source.getText());
				// System.out.println("Activated: " + source.getText());
			}
		};

		KeyStroke button1KeyStroke = KeyStroke.getKeyStroke('1');
		InputMap inputMap = button1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(button1KeyStroke, ACTION_KEY);
		inputMap = button1.getInputMap();
		ActionMap actionMap = button1.getActionMap();
		button1.setActionMap(actionMap);
		actionMap.put(ACTION_KEY, actionListenerButtonNumber);

		KeyStroke button2KeyStroke = KeyStroke.getKeyStroke('2');
		inputMap = button2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(button2KeyStroke, ACTION_KEY);
		inputMap = button2.getInputMap();
		actionMap = button2.getActionMap();
		button2.setActionMap(actionMap);
		actionMap.put(ACTION_KEY, actionListenerButtonNumber);
	}

	void buttonNumberClick(String s) {
		if (bool) {
			textPaneMainResult.setText("");
			bool = false;
		}
		if (textPaneMainResult.getText().equals("0")) {
			textPaneMainResult.setText("");
		}
		textPaneMainResult.setText(textPaneMainResult.getText() + s);
	}

	void setOPerationTextPaneResult(String s) {
		operationStr = s;
		inputNumber = Double.parseDouble(getOutResultStr(textPaneMainResult.getText()));
		textPaneResult.setText(setOutResultStr(getOutResultStr(textPaneMainResult.getText())) + " " + operationStr);
		bool = true;

	}

	String getOutResultStr(String strOut) {
		strOut = strOut.replace(',', '.');
		return strOut;
	}

	String setOutResultStr(String strOut) {
		double doubleOut = Double.parseDouble(strOut);
		double intTest = doubleOut % 1;
		if (intTest == 0) {
			int res = (int) doubleOut;
			strOut = String.valueOf(res);
		} else {
			strOut = strOut.replace('.', ',');
		}
		int maxLengthStrOut = 15;
		if (strOut.length() > maxLengthStrOut) {
			strOut = strOut.substring(0, maxLengthStrOut);
		}
		return strOut;
	}
}
