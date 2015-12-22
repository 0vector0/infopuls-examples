package course01.prj14;

public class Line {

	private Point start;
	private Point end;
	
	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}

	//Агрегация обьектов (передача по ссылке)
	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	//Композиция обьектов (передача данных по значению)
	public Line(int x1, int y1, int x2, int y2) {
		this.start = new Point(x1, y1);
		this.end = new Point(x2, y2);
	}
	
	
	
}
