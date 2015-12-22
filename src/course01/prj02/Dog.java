package course01.prj02;

public class Dog {
	String name;
	int weight;
	int year;
	int color;

	Dog(String name, int weight, int year, int color) {
		System.out.println("create dog...");
		this.name = name;
		this.weight = weight;
		this.year = year;
		this.color = color;
	}

	void sleep() {
		System.out.println("Dog sleep...");
	}

	void say(String word) {
		System.out.println("Dog say " + word + " way, way...");
		}
		
	void eat(int food) {
		this.weight = this.weight + food;
	}
	
	void eatCat(Cat foodCat){
		this.weight = this.weight + foodCat.weight;
		System.out.println("dog eating cat name " + foodCat.name);
		foodCat.aLife = false;
	}

}
