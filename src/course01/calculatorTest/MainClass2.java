package course01.calculatorTest;

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
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

public class MainClass2 {

  public static void main(String args[]) {
    String ACTION_KEY = "The Action";
    
    JFrame frame = new JFrame("KeyStroke Sample");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextPane jTextPane = new JTextPane();
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");

    

    Action actionListener = new AbstractAction() {
      public void actionPerformed(ActionEvent actionEvent) {
        JButton source = (JButton) actionEvent.getSource();
        jTextPane.setText(source.getText());
        System.out.println("Activated: " + source.getText());
      }
    };
    
    KeyStroke button1KeyStroke = KeyStroke.getKeyStroke('1');
    InputMap inputMap = button1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    inputMap.put(button1KeyStroke, ACTION_KEY);
    inputMap = button1.getInputMap();
    ActionMap actionMap = button1.getActionMap();
    button1.setActionMap(actionMap);
    actionMap.put(ACTION_KEY, actionListener);
    
    KeyStroke button2KeyStroke = KeyStroke.getKeyStroke('2');
    inputMap = button2.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    inputMap.put(button2KeyStroke, ACTION_KEY);
    inputMap = button2.getInputMap();
    actionMap = button2.getActionMap();
    button2.setActionMap(actionMap);
    actionMap.put(ACTION_KEY, actionListener);
    
    
  

    frame.setLayout(new GridLayout(2, 2));
    frame.add(button1);
    frame.add(button2);
    frame.add(jTextPane);
  //  frame.add(buttonB);
  //  frame.add(buttonC);
  //  frame.add(buttonD);

    frame.setSize(400, 200);
    frame.setVisible(true);
  }
}


// KeyStroke controlAlt7 = KeyStroke.getKeyStroke("control alt 7");

// inputMap.put(controlAlt7, ACTION_KEY);
 //ActionMap actionMap = button1.getActionMap();


// KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true);
// inputMap = buttonB.getInputMap();
// inputMap.put(enter, ACTION_KEY);
//  buttonB.setActionMap(actionMap);

// KeyStroke shiftF4 = KeyStroke.getKeyStroke(KeyEvent.VK_F4,InputEvent.SHIFT_MASK);
// inputMap = buttonC.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
// inputMap.put(shiftF4, ACTION_KEY);
 //buttonC.setActionMap(actionMap);

//  KeyStroke space = KeyStroke.getKeyStroke(' ');
// inputMap = buttonD.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//  inputMap.put(space, ACTION_KEY);
// buttonD.setActionMap(actionMap);
 
// KeyStroke button1KeyStroke = KeyStroke.getKeyStroke('1');
//  inputMap = button1.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
//  inputMap.put(button1KeyStroke, ACTION_KEY);
//  button1.setActionMap(actionMap);

