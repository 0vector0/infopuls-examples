package course02.prj17exceptions;

class MyExceptions extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My logical ex";
	}

}

public class MainEx {

	static void f() {
		int value = 10;
		int x = 2;
		int y = 0;
		int[] mass = new int[10];

		// if (x != 0) {
		// System.out.println(value / x);
		// } else {
		// System.err.println("Divide by 0");
		// }

		try {
			System.out.println("Before calc");
			y = value / x;
			System.out.println(y);
			System.out.println(mass[10]);
			System.out.println("After calc");

		} catch (ArithmeticException e) {
			System.out.println("Divide by 0");
			// throw e;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("out of array index");
			// throw e;
		} catch (Exception e) {
			System.out.println("Last in f");
			// throw e;
		} finally {
			System.out.println("everytime");
		}
		System.out.println("Return to normal y = " + y);
	}

	static float f1() {
		float t = 10;
		float x = 5;
		try {
			if (t / x == 2) {
				throw new MyExceptions();
			}
			t = 5 / 0;

		} catch (MyExceptions e) {
			System.out.println(e);
		} finally {
			System.out.println("vse ravno pechatau");
		}

		return t;
	}

	public static void main(String[] args) {

		try {
			// f();
			System.out.println(f1());
		} catch (Exception e) {
			System.out.println("ex in main");
			throw e;
		}
	}
}
