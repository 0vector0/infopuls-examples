package course01.prj14;

/**
 * @author vector
 * @version 1.1
 */
public class ColorPoint extends Point implements ColorAble {
	private int color;

	/**
	 * 
	 * @param x
	 * @param y
	 * @param color
	 */
	public ColorPoint(int x, int y, int color) {
		super(x, y);
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
