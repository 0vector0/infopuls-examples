package course01.prj14;

public class Triangle {
	
	private Point apexA;
	private Point apexB;
	private Point apexC;
	
	private Line sideA;
	private Line sideB;
	private Line sideC;

	public Triangle(Point apexA, Point apexB, Point apexC) {
		super();
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
		sideA = new Line(apexB, apexC);
		sideB = new Line(apexA, apexC);
		sideC = new Line(apexA, apexB);
	}

	public Point getApexA() {
		return apexA;
	}

	public void setApexA(Point apexA) {
		this.apexA = apexA;
	}

	public Point getApexB() {
		return apexB;
	}

	public void setApexB(Point apexB) {
		this.apexB = apexB;
	}

	public Point getApexC() {
		return apexC;
	}

	public void setApexC(Point apexC) {
		this.apexC = apexC;
	}

	public Line getSideA() {
		return sideA;
	}

	public void setSideA(Line sideA) {
		this.sideA = sideA;
	}

	public Line getSideB() {
		return sideB;
	}

	public void setSideB(Line sideB) {
		this.sideB = sideB;
	}

	public Line getSideC() {
		return sideC;
	}

	public void setSideC(Line sideC) {
		this.sideC = sideC;
	}
	
}
