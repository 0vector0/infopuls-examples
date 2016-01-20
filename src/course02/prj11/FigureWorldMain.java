package course02.prj11;

public class FigureWorldMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point b = new Point();
		System.out.println(b.toString());
		System.out.println(b.getX());
		System.out.println(b.getY());

		Point a = new Point(1, 1);
		Point c = new Point(2, 2);
		Line l1 = new Line(a, c);

		// Агрегация
		Line l2 = new Line(new Point(3, 3), new Point(4, 4));

		// Композиция
		Line l3 = new Line(6, 6, 7, 7);

		System.out.println(l1);

		Triangle tri = new Triangle(new Point(8, 8), a, c);
		tri.getSideB();
		System.out.println(tri.toString());

		Figure[] mas = new Figure[4];
		mas[0] = a;
		mas[1] = l1;
		mas[2] = tri;
		mas[3] = new ColorPoint(9, 9, 9999);
		
		System.out.println("------------");
		//Динамическое приведение типа (в момент работы программы)
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] instanceof Point) {
				System.out.println(((Point)mas[i]).getX());
			}
			if (mas[i] instanceof Line){
				System.out.println(((Line)mas[i]).length());
			}
			if (mas[i] instanceof Triangle){
				System.out.println(((Triangle)mas[i]).getApexA());
			}
		}

		ColorAble [] masColor = new ColorAble[3];
		masColor[0] = new ColorPoint(1, 2, 777);
		masColor[1] = new ColorLine(a, c, 8888);
		masColor[2] = new ColorHouse(65);
		
		System.out.println("------------------");
		for (int i = 0; i < masColor.length; i++) {
			System.out.println(masColor[i] + "" + masColor[i].getClass());
			
		}
		
		
	}

}
