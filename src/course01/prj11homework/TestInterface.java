package prj11homework;

import java.util.Arrays;

public class TestInterface {

	public static void main(String[] args) {
		
		MoveAble[] moveAble = new MoveAble[3];
		moveAble[0] = new CCar("car", 54, 5454, 5453);
		moveAble[1] = new TachkaBetmena("Betman", 54, 5454, 5453, "black");
		moveAble[2] = new TachkaFantomasa("Fantomas", 54, 5454, 5453, "grey");
		
		
		for (int i = 0; i < moveAble.length; i++) {
			moveAble[i].move();
		}
		
		
		SwimAble[] swimAbles = new SwimAble[2];
		swimAbles[0] = new CShip("Кораблик", 544, 10, 543, "Kiev", 534);
		swimAbles[1] = new TachkaFantomasa("Фантомас", 544, 3323, 54, "grey");
		
		for (int i = 0; i < swimAbles.length; i++) {
			swimAbles[i].swim();
		}
		
		// TODO Auto-generated method stub

	}

}
