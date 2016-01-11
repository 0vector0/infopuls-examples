package course01.calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.KeyStroke;

public class ButtonClass {

  public static void main(String args[]) {
    String ACTION_KEY = "";
    
    JFrame frame = new JFrame("KeyStroke Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton button1 = new JButton("1");

    Action actionListener = new AbstractAction() {
      public void actionPerformed(ActionEvent actionEvent) {
        JButton source = (JButton) actionEvent.getSource();
        System.out.println("Activated: " + source.getText());
      }
    };

    KeyStroke keyStrokeButton1 = KeyStroke.getKeyStroke("1");
    InputMap inputMap = button1.getInputMap();
    inputMap.put(keyStrokeButton1, ACTION_KEY);
    ActionMap actionMap = button1.getActionMap();
    actionMap.put(ACTION_KEY, actionListener);


    frame.setLayout(new GridLayout(2, 2));
    frame.add(button1);

    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}

