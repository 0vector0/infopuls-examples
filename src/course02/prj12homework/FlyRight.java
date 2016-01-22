package course02.prj12homework;

public class FlyRight implements FlyBehavior {

	public void fly(DuckPanel duckPanel) {
		int x = 0;
		int y;
		while (x == 600) {
			duckPanel.setBounds(x, 0, 180, 180);
			x++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			duckPanel.repaint();
		}
		// duckPanel.setBounds(0, 0, 180, 180);
		// System.out.println("Fly to Right");
		// TODO Auto-generated method stub

	}

}
