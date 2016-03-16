package course02.prj26Thread;

public class MyThreadEven extends Thread {

	SharedValue sharedValue;

	public MyThreadEven(SharedValue sharedValue) {
		this.sharedValue = sharedValue;
	}

	@Override
	public void run() {

		while (true) {
			System.out.println("even " + (sharedValue.value += 2));
			if (sharedValue.value > 100)
				break;
		}
	}

}
