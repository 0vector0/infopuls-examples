package course02.prj11;

public class Line extends Figure {
	
	private Point start;
	private Point end;
	
	public Line(Point start, Point end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	//композиция
	public Line(int x1, int y1, int x2, int y2){
		start = new Point(x1, y1);
		end = new Point(x2, y2);
		
	}
	
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

	double length(){
		return Math.sqrt(
				Math.pow(start.getX() - end.getX(), 2) +
				Math.pow(start.getY() - end.getY(), 2)
				);
	}
	
	@Override
	public String toString() {
		return "Line [start=" + start + ", end=" + end + "]";
	}

	@Override
	void print() {
		System.out.println(this.toString());
	}
	
	
	

}
