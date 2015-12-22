package course01.prj15;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;



public class SimpleWindow1  extends JFrame {
	
	private JPanel createPanel(Border border, String text) {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(new JButton(text));
		panel.setBorder(new CompoundBorder(new EmptyBorder(12,12,12,12), border));
		return panel;
		}
	
	SimpleWindow1(){
		super("Пробное окно");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2,3,5,10));
		panel.add(createPanel(new TitledBorder("Рамка с заголовком"), "TitledBorder"));
		panel.add(createPanel(new EtchedBorder(), "EtchedBorder"));
		panel.add(createPanel(new BevelBorder(BevelBorder.LOWERED), "BevelBorder"));
		panel.add(createPanel(new SoftBevelBorder(BevelBorder.RAISED), "SoftBevelBorder"));
		panel.add(createPanel(new LineBorder(Color.ORANGE, 4), "LineBorder"));
		panel.add(createPanel(new MatteBorder(new ImageIcon("1.gif")), "MatteBorder"));
		setContentPane(panel);
		pack();
		}
}