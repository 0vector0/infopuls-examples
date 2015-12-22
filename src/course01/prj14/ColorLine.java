package course01.prj14;

public class ColorLine extends Line implements ColorAble {
	private int color;

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public ColorLine(Point start, Point end, int color) {
		super(start, end);
		this.color = color;
	}

	public ColorLine(Line l, int color) {
		super(l.getStart(), l.getEnd());
		this.color = color;
	}

	@Override
	public int compareTo(ColorAble o) {
		if (this.getColor() > o.getColor())
			return 1;
		else if (this.getColor() < o.getColor())
			return -1;
		return 0;
	}
}
