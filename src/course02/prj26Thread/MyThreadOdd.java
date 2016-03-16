package course02.prj26Thread;

public class MyThreadOdd extends Thread {

	SharedValue sharedValue;

	public MyThreadOdd(SharedValue sharedValue) {
		this.sharedValue = sharedValue;
	}

	@Override
	public void run() {
		// int value = 1;
		while (true) {
			System.out.println("odd " + (sharedValue.value += 2));
			if (sharedValue.value > 100)
				break;
		}
	}

}
