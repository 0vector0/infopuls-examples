package course01.calculatorTest;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class KeyboardController {
	public static void main(String[] args) {
		KeyboardFocusManager kfm = KeyboardFocusManager.getCurrentKeyboardFocusManager();
		kfm.addKeyEventDispatcher(new KeyEventDispatcher() {

			@Override
			public boolean dispatchKeyEvent(KeyEvent arg0) {
				System.out.println(arg0.getKeyCode() + "\t\t" + arg0.getKeyChar());
				return false;
			}
			
		});
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new JFrame().setVisible(true);
	}
}
