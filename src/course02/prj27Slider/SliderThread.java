package course02.prj27Slider;

import javax.swing.JSlider;

public class SliderThread extends Thread {

	JSlider slider;
	int delta;

	public SliderThread(JSlider slider, int delta) {

		this.slider = slider;
		this.delta = delta;

		// slider.setValue(slider.getValue() + 1);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// super.run();
		while (true) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (slider.getValue() > 10 && slider.getValue() < 90) {
				slider.setValue(slider.getValue() + delta);
			}
		}
	}

}
