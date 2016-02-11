package course02.prj18;

import java.io.*;

class Point implements java.io.Serializable {
	double x;
	double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")reference=" + super.toString();
	}
}

class Line implements java.io.Serializable {
	Point point1;
	Point point2;
	int index;

	public Line() {
		System.out.println("Constructing 	empty 	line");
	}

	Line(Point p1, Point p2, int index) {
		System.out.println("Constructing 	line: 	" + index);
		this.point1 = p1;
		this.point2 = p2;
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int newIndex) {
		index = newIndex;
	}

	public void printInfo() {
		System.out.println("Line: 	" + index);
		System.out.println(" 	Object 	reference: 	" + super.toString());
		System.out.println(" 	from 	point 	" + point1);
		System.out.println(" 	to 	point 	" + point2);
	}
}

public class Main {
	public static void main(java.lang.String[] args) {
		Point p1 = new Point(1.0, 1.0);
		Point p2 = new Point(2.0, 2.0);
		Point p3 = new Point(3.0, 3.0);
		Line line1 = new Line(p1, p2, 1);
		Line line2 = new Line(p2, p3, 2);
		System.out.println("line 	1 	= 	" + line1);
		System.out.println("line 	2 	= 	" + line2);
		String fileName = "file";
		try {
			// write objects to file
			FileOutputStream os = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(line1);
			oos.writeObject(line2);
			// change state of line 1 and write it again
			line1.setIndex(3);
			// oos.reset();
			oos.writeObject(line1);
			// close stream
			// it is enought to close only filter stream
			oos.close();
			os.close();
			// read objects
			System.out.println("Read 	objects:");
			FileInputStream is = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(is);
			while (is.available() > 0) {
				Line line = (Line) ois.readObject();
				line.printInfo();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

