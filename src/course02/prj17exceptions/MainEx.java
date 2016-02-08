package course02.prj17exceptions;

public class MainEx {

	public static void main(String[] args) {

		int value = 10;
		int x = 0;

		if (x != 0) {
			System.out.println(value / x);
		} else {
			System.err.println("Divide by 0");
		}

	}

}
