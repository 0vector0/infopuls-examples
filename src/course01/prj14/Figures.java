package course01.prj14;

import java.util.Arrays;

public class Figures {

	public static int testColor(ColorAble colorObj) {
		return colorObj.getColor();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point a = new Point(1, 1);
		Point b = new Point(2, 2);
		ColorPoint cp = new ColorPoint(3, 3, 666666);
		Line l1 = new Line(a, b);
		Line l2 = new Line(3, 3, 4, 4);
		Line l3 = new Line(new Point(5,5), new Point(6,6));
		ColorLine cl1 = new ColorLine(a, b, 777777);
		ColorLine cl2 = new ColorLine(l1, 432423);
		ColorTriange ctr = new ColorTriange(a, b, new Point(9, 9), 88);
		
		ColorAble [] colorFigure = new ColorAble[3];
		colorFigure[0] = cp;
		colorFigure[1] = cl1;
		colorFigure[2] = ctr;
		
		for (int i = 0; i < colorFigure.length; i++) {
			System.out.print(testColor(colorFigure[i]) + ", ");
			System.out.println(colorFigure[i].getClass().getName());
		}
		
		
		System.out.println("sort");
		Arrays.sort(colorFigure);
		for (int i = 0; i < colorFigure.length; i++) {
			System.out.print(testColor(colorFigure[i]) + ", ");
			System.out.println(colorFigure[i].getClass().getName());
		}
		
		//System.out.println(Arrays.toString(colorFigure));
	}

}
