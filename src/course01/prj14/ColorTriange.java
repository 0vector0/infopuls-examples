package course01.prj14;


public class ColorTriange extends Triangle implements ColorAble {

	private int color;

	public ColorTriange(Point apexA, Point apexB, Point apexC, int color) {
		super(apexA, apexB, apexC);
		this.color = color;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
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
