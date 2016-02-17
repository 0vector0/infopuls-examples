package course02.prj20StackVagon;

public class Vagon {
	int id;

	public int getId() {
		return id;
	}

	public Vagon() {
		this.id = getRandType();
	}

	private int getRandType() {
		return (int) (Math.random() * 2);
	}

	@Override
	public String toString() {
		return "type = " + id;
	}
}
