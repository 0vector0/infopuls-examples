package course02.prj20StackVagon;

public class StackSostav {

	private Vagon[] sostavVagon;
	private int top;

	public StackSostav(int n) {

		sostavVagon = new Vagon[n];
		top = 0;
	}

	public void fillSostav() {
		for (int i = 0; i < sostavVagon.length; i++) {
			sostavVagon[i] = new Vagon();
			top++;
		}
	}

	public int getVagonType(int i) {
		return sostavVagon[i].getId();
	}

	public int capacity() {
		return sostavVagon.length;
	}

	public int size() {
		return top;
	}

	public void push(Vagon vagon) {
		if (!isFull())
			sostavVagon[top++] = vagon;
	}

	public Vagon pop() {
		if (!isEmpty()) {
			top--;
			return sostavVagon[top];
		} else {
			return null;
		}
	}

	boolean isEmpty() {
		// if (top < 0) {
		// return true;
		// } else {
		// return false;
		// }
		return top < 0;
	}

	boolean isFull() {
		return (top >= sostavVagon.length) ? true : false;

	}

}
