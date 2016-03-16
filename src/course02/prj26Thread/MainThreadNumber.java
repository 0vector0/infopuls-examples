package course02.prj26Thread;

public class MainThreadNumber {

	public static void main(String[] args) {

		SharedValue sharedValue = new SharedValue();

		MyThreadOdd threadOdd = new MyThreadOdd(sharedValue);
		MyThreadEven threadEven = new MyThreadEven(sharedValue);
		threadEven.start();
		threadOdd.start();

		System.out.println(sharedValue.value);
	}

}
