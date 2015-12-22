package course01.prj02;

public class ZooPark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog sharik = new Dog("Shar sharikovich", 35, 10, 1);

		Dog bobik = new Dog("Bobikovich", 45, 15, 1);

		// int weightDog = sharik.weight + bobik.weight;

		System.out.println("dog name - " + sharik.name);
		System.out.println("dog name - " + bobik.name);
		sharik.sleep();
		sharik.say("Hello world");
		System.out.println("sharik weight before eat " + sharik.weight);
		sharik.eat(5);
		System.out.println("sharik weight after eat " + sharik.weight);

		Cat murzik = new Cat("Murzik", 10, 2, 1);
		System.out.println("murzik weight " + murzik.weight);
		sharik.eatCat(murzik);
		
		
		System.out.println("sharik weight after eat cat " + sharik.weight);
		
		int a = 5 ;
		int b = 6 ;
		
		System.out.println(a==b ? "a � b �����!" : "a � b �� �����!");
	}

}
