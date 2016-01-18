package course02.prj11;

public class Triangle extends Figure {

	Point apexA;
	Point apexB;
	Point apexC;

	Line sideA;
	Line sideB;
	Line sideC;

	public Triangle(Point apexA, Point apexB, Point apexC) {
		this.apexA = apexA;
		this.apexB = apexB;
		this.apexC = apexC;
	//	this.sideA = new Line(apexB, apexC);
	//	this.sideB = new Line(apexA, apexC);
	//	this.sideC = new Line(apexA, apexB);

	}
	
	public Point getApexA() {
		return apexA;
	}
	public void setApexA(Point apexA) {
		this.apexA = apexA;
		sideB = null;
		sideC = null;
	}
	public double getSideB() {
		if (sideB == null) {
		this.sideB = new Line(apexA, apexC);
		}
		return this.sideB.length();
	}

	@Override
	public String toString() {
		return "Triangle [apexA=" + apexA + ", apexB=" + apexB + ", apexC=" + apexC + "]";
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
