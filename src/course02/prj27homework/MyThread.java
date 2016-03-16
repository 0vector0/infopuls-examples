package course02.prj27homework;

import javax.swing.JPanel;

public class MyThread extends Thread {

	JPanel panel;

	public MyThread(JPanel panel) {
		this.panel = panel;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		super.run();
		panel = new FlyCircle();
		panel.repaint();
	}
}
