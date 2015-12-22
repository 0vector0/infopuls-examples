package course01.prj15;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleWindow extends JFrame {

	JButton createButton(String textOnButton, int x, int y) {
		JButton button = new JButton(textOnButton);
		button.setPreferredSize(new Dimension(x, y));
		button.setMargin(new Insets(0,0,0,0));
		return button;
	}

	SimpleWindow() {
		
		super("Калькулятор");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//JPanel panelButton = new JPanel();
		
		
		
		
		JPanel panelAll = new JPanel();
		
		//panelText
		JPanel panelText = new JPanel();
		panelText.setLayout(new FlowLayout());
		JTextField text0 = new JTextField("000000000000000000000000");
		text0.setHorizontalAlignment(JTextField.RIGHT);
		//text0.setSize(500, 100);
		panelText.add(text0);
		
		
		int sizeButton = 50;
		//panelButtonUp
		JPanel panelButtonLeftUp = new JPanel();
		panelButtonLeftUp.setLayout(new GridLayout(4,4));
		//JButton buttonBackSpase = new JButton("\u2190");
		//buttonBackSpase.setPreferredSize(new Dimension(50,50));
		JButton buttonBackSpase = createButton("\u2190", sizeButton, sizeButton);
		panelButtonLeftUp.add(buttonBackSpase);
		JButton buttonCE = new JButton("CE");
		panelButtonLeftUp.add(buttonCE);
		JButton buttonC = new JButton("C");
		panelButtonLeftUp.add(buttonC);
		JButton buttonPlusMinus =  new JButton("\u00B1");
		panelButtonLeftUp.add(buttonPlusMinus);
		JButton button7 =  new JButton("7");
		panelButtonLeftUp.add(button7);
		JButton button8 =  new JButton("8");
		panelButtonLeftUp.add(button8);
		JButton button9 =  new JButton("9");
		panelButtonLeftUp.add(button9);
		JButton buttonDivinity =  new JButton("/");
		panelButtonLeftUp.add(buttonDivinity);
		JButton button4 =  new JButton("4");
		panelButtonLeftUp.add(button4);
		JButton button5 =  new JButton("5");
		panelButtonLeftUp.add(button5);
		JButton button6 =  new JButton("6");
		panelButtonLeftUp.add(button6);
		JButton buttonMultiplication =  new JButton("*");
		panelButtonLeftUp.add(buttonMultiplication);
		JButton button1 =  new JButton("1");
		panelButtonLeftUp.add(button1);
		JButton button2 =  new JButton("2");
		panelButtonLeftUp.add(button2);
		JButton button3 =  new JButton("3");
		panelButtonLeftUp.add(button3);
		JButton buttonMinus =  new JButton("-");
		panelButtonLeftUp.add(buttonMinus);
		
		//panelButtonDown
		JPanel panelButtonLeftDown = new JPanel(new BorderLayout());
		
		JButton buttonZero =  new JButton("0");
		buttonZero.setPreferredSize(new Dimension(100,50));
		panelButtonLeftDown.add(buttonZero, BorderLayout.WEST);
		JButton buttonComa =  new JButton(",");
		buttonComa.setPreferredSize(new Dimension(50,50));
		panelButtonLeftDown.add(buttonComa, BorderLayout.CENTER);
		JButton buttonPlus =  new JButton("+");
		buttonPlus.setPreferredSize(new Dimension(50,50));
		panelButtonLeftDown.add(buttonPlus, BorderLayout.EAST);
		
		
		//panelButtonLeft
		JPanel panelButtonLeft = new JPanel(new BorderLayout());
		panelButtonLeft.add(panelButtonLeftUp, BorderLayout.NORTH);
		panelButtonLeft.add(panelButtonLeftDown, BorderLayout.SOUTH);
		
		//panelButtonRightUp
		JPanel panelButtonRightUp = new JPanel(new BorderLayout());
		JButton buttonSqr =  new JButton("\u221A");
		buttonSqr.setPreferredSize(new Dimension(50,50));
		panelButtonRightUp.add(buttonSqr, BorderLayout.NORTH);
		JButton buttonPercent =  new JButton("\u0025");
		buttonPercent.setPreferredSize(new Dimension(50,50));
		panelButtonRightUp.add(buttonPercent, BorderLayout.CENTER);
		JButton button1DivinityX =  new JButton("1/x");
		button1DivinityX.setMargin(new Insets(0,0,0,0));
		button1DivinityX.setPreferredSize(new Dimension(50,50));
		panelButtonRightUp.add(button1DivinityX, BorderLayout.SOUTH);
		
		//panelButtonRightDown
		JButton buttonEquall = new JButton("=");
		buttonEquall.setPreferredSize(new Dimension(50,100));
		//box.add(buttonEquall);
		//panelButtonRight.add(box, BorderLayout.CENTER);
		
		//panelButtonRight
		JPanel panelButtonRight = new JPanel(new BorderLayout());
		panelButtonRight.add(panelButtonRightUp, BorderLayout.NORTH);
		panelButtonRight.add(buttonEquall, BorderLayout.SOUTH);
		
		//panelButton
		JPanel panelButton = new JPanel(new BorderLayout());
		panelButton.add(panelButtonLeft, BorderLayout.WEST);
		panelButton.add(panelButtonRight, BorderLayout.EAST);
		
		
		
		
		
		
		
		
		panelAll.setLayout(new BorderLayout());
		panelAll.add(panelText, BorderLayout.NORTH);
		panelAll.add(panelButton, BorderLayout.SOUTH);
		
		
		setContentPane(panelAll);
		//setSize(230, 320);
		setResizable(false);
		pack(); //упаковка
		
		
	}
}
