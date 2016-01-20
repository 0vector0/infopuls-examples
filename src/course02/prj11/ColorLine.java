package course02.prj11;

public class ColorLine extends Line implements ColorAble {

	int color;
	public ColorLine(Point start, Point end, int color) {
		super(start,  end);
		this.color = color;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColor() {
		// TODO Auto-generated method stub
		return color;
	}
	

}
