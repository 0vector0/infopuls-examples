package course02.prj11;

public class ColorPoint extends Point implements ColorAble {
	int color;

	public ColorPoint(int x, int y, int color) {
		super(x, y);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}

}
