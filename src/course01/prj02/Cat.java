package course01.prj02;

public class Cat {

	String name;
	int weight;
	boolean aLife;

	Cat(String name, int weight, int year, int color) {
		System.out.println("create cat...");
		this.name = name;
		this.weight = weight;
		aLife = true;
	}
	void sleep() {
		System.out.println("Cat sleep...");
	}

	void say(String word) {
		System.out.println("Cat say " + word + " way, way...");
	}

}
